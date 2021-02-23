package com.tangdou.visitor;

import com.tangdou.ApplicationStarter;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 崔航
 * @date 2021/2/23 13:11
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
public class VisitorTest {

    @Test
    public void test() {
        DataSource dataSource = new DataSource();
        dataSource.setId(1);

        List<Database> databaseList = new ArrayList<>(2);
        dataSource.setChildren(databaseList);

        Database database1 = new Database();
        database1.setId(10);
        databaseList.add(database1);

        Database database2 = new Database();
        database2.setId(20);
        databaseList.add(database2);

        List<Table> tableList1 = new ArrayList<>(2);
        database1.setChildren(tableList1);
        List<Table> tableList2 = new ArrayList<>(1);
        database2.setChildren(tableList2);

        Table table1 = new Table();
        table1.setId(100);
        tableList1.add(table1);

        Table table2 = new Table();
        table2.setId(200);
        tableList1.add(table2);

        Table table3 = new Table();
        table3.setId(300);
        tableList2.add(table3);

        List<Column> columnList1 = new ArrayList<>(2);
        table1.setChildren(columnList1);
        List<Column> columnList2 = new ArrayList<>(6);
        table2.setChildren(columnList2);
        List<Column> columnList3 = new ArrayList<>(3);
        table3.setChildren(columnList3);

        Column column1 = new Column();
        column1.setId(1000);
        columnList1.add(column1);
        Column column2 = new Column();
        column2.setId(2000);
        columnList1.add(column2);
        Column column3 = new Column();
        column3.setId(3000);
        columnList2.add(column3);
        Column column4 = new Column();
        column4.setId(4000);
        columnList2.add(column4);
        Column column5 = new Column();
        column5.setId(5000);
        columnList2.add(column5);
        Column column6 = new Column();
        column6.setId(6000);
        columnList2.add(column6);
        Column column7 = new Column();
        column7.setId(7000);
        columnList2.add(column7);
        Column column8 = new Column();
        column8.setId(8000);
        columnList2.add(column8);
        Column column9 = new Column();
        column9.setId(9000);
        columnList3.add(column9);
        Column column10 = new Column();
        column10.setId(10000);
        columnList3.add(column10);
        Column column11 = new Column();
        column11.setId(11000);
        columnList3.add(column11);

        BaseObject baseObject = dataSource.accept(new FindChild(10000));
        log.info("{}", baseObject);
    }
}
