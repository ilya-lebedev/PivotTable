package com.example.pivottable.controller;

import com.example.pivottable.model.TableElement;
import com.example.pivottable.service.TableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implements a REST-based controller
 */
@RestController
@RequestMapping("/")
public class TableController {

    private Set<String> paramsValues = new HashSet<>(Arrays.asList("a", "b", "c", "d", "y"));

    private TableService tableService;

    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    /**
     * Gets a table consisting of requested rows and columns
     *
     * @param row name of row
     * @param col name of column
     * @return ResponseEntity based on request parameters
     */
    @GetMapping
    public ResponseEntity<List<TableElement>> getTable(@RequestParam(required = false) String row,
                                                       @RequestParam(required = false) String col) {
        if (row == null || col == null || row.equals(col) ||
                !paramsValues.contains(row) || !paramsValues.contains(col)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        return ResponseEntity.ok(tableService.getTable(row, col));
    }

}
