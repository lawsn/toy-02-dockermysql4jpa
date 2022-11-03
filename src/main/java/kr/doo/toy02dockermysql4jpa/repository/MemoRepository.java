package kr.doo.toy02dockermysql4jpa.repository;

import kr.doo.toy02dockermysql4jpa.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
