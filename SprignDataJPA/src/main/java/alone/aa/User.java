package alone.aa;

import lombok.Data;
import javax.persistence.*;
/**
 * @GeneratedValue 指定主键的生成方式。。
 *         	属性：strategy ：指定主键生成策略。
 * @Column
 *        作用：指定实体类属性和数据库表之间的对应关系
*         	属性：
*         		name：指定数据库表的列名称。
*         		unique：是否唯一
*         		nullable：是否可以为空
*         		inserttable：是否可以插入
*         		updateable：是否可以更新
*         		columnDefinition: 定义建表时创建此列的DDL
*         		secondaryTable: 从表名。如果此列不建在主表上（默认建在主表），该属性定义该列所在从表的名字搭建开发环境[重点]
*/
//要导入javax.persistence下的注解
@Data
@Entity  //声明实体类
@Table(name = "userJPA")   //建立实体类和表的映射关系
public class User {
    @Id   //配置主键
    @GeneratedValue(strategy = GenerationType.IDENTITY  ) //配置主键的生成策略，自增
    @Column(name = "id")  //声明该属性和数据库表中的id字段字段映射
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name = "password")
    private String pwd;
}
