package com.uni.dao;

import java.util.List;
import java.util.Map;

public interface Todo<T> { 
  List<Map<String,Object>> readAll2();  
  
}
