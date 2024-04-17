import com.webapp.Util.ClassConfig;
import com.webapp.service.UserParse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.webapp.pojo.UserEntity;
//
//public class MyTest {
//@Test
//    void parse(){
//        ApplicationContext context =new AnnotationConfigApplicationContext(ClassConfig.class);
//        UserEntity usr =  context.getBean("user", UserEntity.class);
//        usr.Crazy();
//
//        Object parse =new UserParse().parser(usr);
//        if (parse instanceof UserEntity){
//            UserEntity entity=(UserEntity)parse;
//            entity.Crazy();
//        }
//
//    }
//}
