package com.xihuanyuye;

import java.util.List;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import com.xihuanyuye.po.Ymq;

/**
 * 描述: 继承 SolrCrudRepository
 *
 * @author yanpenglei
 * @create 2017-10-18 10:34
 **/
public interface YmqRepository extends SolrCrudRepository<Ymq, String> {

    /**
     * 通过标题查询
     *
     * @param ymqTitle
     * @return
     */
    @Query(" ymqTitle:*?0* ")
    public List<Ymq> findByQueryAnnotation(String ymqTitle);
}
