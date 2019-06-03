package com.wei.tempm.controller;

import com.wei.tempm.entity.Person;
import com.wei.tempm.service.PageBean;
import com.wei.tempm.service.PersonService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class PersonController {
    @Autowired
    private PersonService obj;

    // ----------------query----------------
    // get,通过主键查询单值
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/{id}", method = RequestMethod.GET)
    public Person get(@PathVariable("id") Long id) {
        return obj.getById(id);
    }

    // ----------------query----------------  
    // get,复杂条件，查询单值	
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/get", method = RequestMethod.POST, produces ="application/json; charset=utf-8")
    public Person getMap(@RequestBody Map<String, Object> p) {
        return obj.get(p);
    }

    // ----------------query----------------  
    // list--post，查询集合，复杂条件  
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/list", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public List<Person> list(@RequestBody Map<String, Object> p) {
        return obj.list(p);
    }

    // ----------------query----------------  
    // listPage 分页查询集合，复杂条件  
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/listPage/{pageNo}/{pageSize}", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public PageBean<Person> listPage(@PathVariable("pageNo") int pageNo, @PathVariable("pageSize") int pageSize, @RequestBody Map<String, Object> p) {
        return obj.listPage(pageNo, pageSize, p);
    }

    // ------add or update-----------------  
    // put add or update,幂等操作，用于新增或修改数据  
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person", method = RequestMethod.PUT, produces = "application/json; charset=utf-8")
    public Long smartAdd(@RequestBody Person entity) {
        return obj.smartAdd(entity);
    }

    // --------add-----update--------------------  
    // put add or update,幂等操作，用于新增或修改数据  
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/batch", method = RequestMethod.PUT, produces ="application/json; charset=utf-8")
    public Long insertBatch(@RequestBody List<Person> lst) {
        return obj.insertBatch(lst);
    }

    // ---------del-------------------------
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/{id}", method = RequestMethod.DELETE, produces = "application/json; charset=utf-8")
    public Long delById(@PathVariable Long id) {
        return obj.delById(id);
    }

    // ---------------del-----------  
    // del by map  
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person", method = RequestMethod.DELETE, produces = "application/json; charset=utf-8")
    public Long del(@RequestBody Map<String, Object> p) {
        return obj.del(p);
    }

    // ---------------update-----------  
    // update entity 
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbg.generated Mon Jan 28 20:25:58 CST 2019
     */
    @RequestMapping(value = "/Person/update", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public Long update(@RequestBody Person entity) {
        return obj.update(entity);
    }
}