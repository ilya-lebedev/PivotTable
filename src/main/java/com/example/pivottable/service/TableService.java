package com.example.pivottable.service;

import com.example.pivottable.mapper.TableMapper;
import com.example.pivottable.model.TableElement;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Simple service layer class
 * Contains business logic
 */
@Service
public class TableService {

    private TableMapper tableMapper;

    public TableService(TableMapper tableMapper) {
        this.tableMapper = tableMapper;
    }

    public List<TableElement> getTable(String row, String col) {
        return tableMapper.getTable(row, col);
    }

}
