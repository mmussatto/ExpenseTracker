/*
 * Created by murilo.mussatto on 03/03/2023
 */

package dev.mmussatto.expensetracker.api.mappers;

import dev.mmussatto.expensetracker.api.model.TagDTO;
import dev.mmussatto.expensetracker.domain.Color;
import dev.mmussatto.expensetracker.domain.Tag;
import dev.mmussatto.expensetracker.domain.Transaction;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TagMapperTest {

    public static final Integer ID = 1;
    public static final String NAME = "Test";
    public static final Color COLOR = Color.BLUE;
    public static final Set<Transaction> TRANSACTIONS = Stream.of(new Transaction(), new Transaction())
            .collect(Collectors.toSet());

    TagMapper tagMapper = TagMapper.INSTANCE;

    @Test
    void tagToTagDTO() {

        Tag tag = new Tag(NAME, COLOR);
        tag.setId(ID);
        tag.setTransactions(TRANSACTIONS);

        TagDTO tagDTO = tagMapper.convertToDTO(tag);

        assertEquals(tag.getId(), tagDTO.getId());
        assertEquals(tag.getName(), tagDTO.getName());
        assertEquals(tag.getColor(), tagDTO.getColor());
        assertEquals(tag.getTransactions(), tagDTO.getTransactions());
    }

    @Test
    void tagDTOToTag() {

        TagDTO tagDTO = new TagDTO();
        tagDTO.setId(ID);
        tagDTO.setName(NAME);
        tagDTO.setColor(COLOR);
        tagDTO.setTransactions(TRANSACTIONS);

        Tag tag = tagMapper.convertToEntity(tagDTO);

        assertEquals(tagDTO.getId(), tag.getId());
        assertEquals(tagDTO.getName(), tag.getName());
        assertEquals(tagDTO.getColor(), tag.getColor());
        assertEquals(tagDTO.getTransactions(), tag.getTransactions());
    }
}