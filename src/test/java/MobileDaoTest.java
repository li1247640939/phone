import com.ujiuye.bean.Mobile;
import com.ujiuye.dao.MobileDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDaoTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        MobileDao dao = context.getBean(MobileDao.class);

        Mobile mobile = dao.getMobile("1340679");

        System.out.println(mobile);
    }
}
