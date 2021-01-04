package com.docsconsole.tutorials.hibernate5.client;

import com.docsconsole.tutorials.hibernate5.entity.CricketTeam;
import com.docsconsole.tutorials.hibernate5.entity.Cricketer;
import com.docsconsole.tutorials.hibernate5.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.*;
import org.hibernate.transform.DistinctRootEntityResultTransformer;

import java.util.List;

public class MainClient {


    public static void main(String[] args) {
        System.out.println("The main method@MainClient");

        Session session = HibernateUtils.getSessionFactory().openSession();

        // obtains the session
        session.beginTransaction();

		/*Criteria crit = session.createCriteria(Cricketer.class);
		List<Cricketer> results = crit.list();
		results.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria1 = session.createCriteria(Cricketer.class);
        criteria1.add(Restrictions.eq("playerType","Bowler"));
		List<Cricketer> results1 = criteria1.list();
        results1.stream().map(c->c.getFirstName()).forEach(System.out::println);*/


		/*Criteria criteria2 = session.createCriteria(Cricketer.class);
        criteria2.add(Restrictions.ne("salaryIncome",450000l));
		List<Cricketer> results2 = criteria2.list();
        //results2.stream().forEach(System.out::println);
        results2.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria3 = session.createCriteria(Cricketer.class);
		criteria3.add(Restrictions.like("playerType","Bats%", MatchMode.ANYWHERE));
		List<Cricketer> results3 = criteria3.list();
		results3.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria4 = session.createCriteria(Cricketer.class);
		criteria4.add(Restrictions.isNull("jerseyNo"));
		List<Cricketer> results4 = criteria4.list();
		results4.stream().map(c->c.getFirstName()).forEach(System.out::println);*/


		/*Criteria criteria5 = session.createCriteria(Cricketer.class);
		criteria5.add(Restrictions.isNotNull("jerseyNo"));
		List<Cricketer> results5 = criteria5.list();
		results5.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria6 = session.createCriteria(Cricketer.class);
		criteria6.add(Restrictions.gt("salaryIncome", 450000l));
		List<Cricketer> results6 = criteria6.list();
        results6.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria7 = session.createCriteria(Cricketer.class);
		criteria7.add(Restrictions.lt("salaryIncome", 500000l));
		criteria7.add(Restrictions.ilike("nation","Aust%", MatchMode.ANYWHERE));
		List<Cricketer> results7 = criteria7.list();
        results7.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria8 = session.createCriteria(Cricketer.class);
		Criterion empSalCond = Restrictions.lt("salaryIncome", 500000l);
		Criterion firstNameCond = Restrictions.ilike("playerType","Bats%", MatchMode.ANYWHERE);
		LogicalExpression orExp = Restrictions.or(empSalCond, firstNameCond);
		criteria8.add(orExp);
		List results8 = criteria8.list();
        results8.stream().map(c->((Cricketer) c).getFirstName()).forEach(System.out::println);*/

		/*Criteria criteria9 = session.createCriteria(Cricketer.class);
		Criterion empSalCond = Restrictions.gt("salaryIncome", 450000l);
		Criterion firstNameCond = Restrictions.like("firstName","an%", MatchMode.ANYWHERE);
		LogicalExpression orExp = Restrictions.or(empSalCond,firstNameCond);
		criteria9.add(orExp);
		criteria9.add(Restrictions.ilike("lastName","B%", MatchMode.ANYWHERE));
		List results9 = criteria9.list();
        results9.stream().map(c->((Cricketer) c).getFirstName()).forEach(System.out::println);*/


        /*Criteria criteria10 = session.createCriteria(Cricketer.class);
        Criterion priceLessThan = Restrictions.lt("salaryIncome", 450000l);
        Criterion firstNameCond = Restrictions.ilike("firstName","an%", MatchMode.ANYWHERE);
        Criterion lastNameCond = Restrictions.ilike("lastName","Wil%", MatchMode.ANYWHERE);
        Disjunction disjunction = Restrictions.disjunction();
        disjunction.add(priceLessThan);
        disjunction.add(firstNameCond);
        disjunction.add(lastNameCond);
        criteria10.add(disjunction);
        List results10 = criteria10.list();
        results10.stream().map(c->((Cricketer) c).getFirstName()).forEach(System.out::println);*/

       /* Criteria criteria11 = session.createCriteria(Cricketer.class);
        criteria11.add(Restrictions.sqlRestriction("{alias}.player_type like 'Bow%'"));
        List<Cricketer> results11 = criteria11.list();
        results11.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

        /*Criteria criteria12 = session.createCriteria(Cricketer.class);
        criteria12.setFirstResult(1);
        criteria12.setMaxResults(5);
        List<Cricketer> results12 = criteria12.list();
        results12.stream().map(c->c.getFirstName()).forEach(System.out::println);*/


       /* Criteria criteria13 = session.createCriteria(Cricketer.class);
        Criterion salCond = Restrictions.gt("salaryIncome",new Long(500000));
        criteria13.add(salCond);
        criteria13.setResultTransformer( DistinctRootEntityResultTransformer.INSTANCE );
        List<Cricketer> results13 = criteria13.list();
        results13.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

        /*Criteria criteria14 = session.createCriteria(Cricketer.class);
        criteria14.add(Restrictions.gt("salaryIncome", 450000l));
        criteria14.addOrder(Order.desc("salaryIncome"));
        List<Cricketer> results14 = criteria14.list();
        results14.stream().map(c->c.getFirstName()).forEach(System.out::println);*/

       /* Criteria criteria15 = session.createCriteria(CricketTeam.class);
        Criteria criteria16 = criteria15.createCriteria("cricketer");
        criteria16.add(Restrictions.gt("salaryIncome", 450000l));
        List results15 = criteria15.list();*/


        /*Criteria criteria17 = session.createCriteria(Cricketer.class);
        Criteria criteria18 = criteria17.createCriteria("cricketTeam");
        criteria18.add(Restrictions.gt("nation", "%New%"));
        List results18 = criteria17.list();
        results18.stream().map(c->((Cricketer) c).getFirstName()).forEach(System.out::println);*/

      /* List results19 = session.createCriteria(Cricketer.class).
                add(Restrictions.like("firstName", "%Kane%"))
                .createCriteria("cricketTeam").add(Restrictions.like("nation", "%New%"))
                .list();
        criteria19.stream().map(c->((Cricketer) c).getFirstName()).forEach(System.out::println);*/

        /*List results20 = session.createCriteria(Cricketer.class).
                add(Restrictions.like("firstName", "%Kane%"))
                .setFetchMode("cricketTeam", FetchMode.EAGER).list();
        results20.stream().map(c-> c).forEach(System.out::println);*/


        /*Criteria results21 = session.createCriteria(Cricketer.class);
        results21.setProjection(Projections.rowCount());
        List<Long> results22 = results21.list();
        results22.stream().forEach(System.out::println);*/


        //To-do need to improve the result
        /*Criteria criteria18 = session.createCriteria(Cricketer.class);
        ProjectionList projList = Projections.projectionList();
        projList.add(Projections.max("age"));
        projList.add(Projections.min("age"));
        projList.add(Projections.avg("age"));
        projList.add(Projections.countDistinct("playerType"));
        criteria18.setProjection(projList);
        List<Object[]> results23 = criteria18.list();
        results23.stream().map(c->((Object) c)).filter(o -> o instanceof Cricketer ).map(o->((Cricketer) o).getFirstName()).forEach(System.out::println);*/


        Criteria criteria19 = session.createCriteria(Cricketer.class);
        Cricketer cricketer = new Cricketer();
        cricketer.setAge(32l);
        criteria19.add(Example.create(cricketer));
        List results23 = criteria19.list();
        results23.stream().forEach(System.out::println);

        session.getTransaction().commit();
        session.close();
    }
}
