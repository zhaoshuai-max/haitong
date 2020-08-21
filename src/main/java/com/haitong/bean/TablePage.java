package com.haitong.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TablePage<T> {
	private int pageNumber;
	private int pageSize;
	private List<T> rows;
	private long total;
	private int pageCount;
}
