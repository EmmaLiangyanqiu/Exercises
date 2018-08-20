package mybatis.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Emma on 2018/8/17.
 */

@Component
public class UserMapperImpl extends SqlSessionTemplate implements UserMapper {
    @Autowired
    private SqlSession sqlSession;

    public UserMapperImpl(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public void selectMore(){
        sqlSession.selectOne("UserMapper.selectMore");
    }

}
