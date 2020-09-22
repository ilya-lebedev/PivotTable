package com.example.pivottable.mapper;

import com.example.pivottable.model.TableElement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * TableMapper interface maps methods to their corresponding SQL statements
 */
@Mapper
public interface TableMapper {

    /**
     * Return list of Table elements based on requested row name and column name
     *
     * @param row name of row
     * @param col name of column
     * @return list of table elements
     */
    @Select("SELECT ${row} as row, ${col} as col, sum(v) as val FROM source_data GROUP BY row, col")
    List<TableElement> getTable(String row, String col);

}
