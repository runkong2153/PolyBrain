package web.mem.dao;

import web.mem.vo.MemVO;

public interface MemDAO {
    int insert(MemVO memVO);
    int deleteById(Integer memNo);
    boolean updateByMerge(MemVO memVO);
}
