package com.xihuanyuye.po;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.io.Serializable;

/**
 * 描述: 映射的实体类必须有@ID主键
 *
 * @author yanpenglei
 * @create 2017-10-17 18:28
 **/
// @SolrDocument(solrCoreName = "xihuanyuye")
public class Ymq implements Serializable {

	public Ymq() {// 此处应该注意，当QueryResponse.getBeans(PeopleBean.class);方式查询，并返回实体bean时，必须有一个空的构造方法

	}

	public Ymq(String id, String ymqTitle, String ymqUrl, String ymqContent) {
		this.id = id;
		this.ymqTitle = ymqTitle;
		this.ymqUrl = ymqUrl;
		this.ymqContent = ymqContent;
	}

	@Id
	@Field
	private String id;

	@Field
	private String ymqTitle;

	@Field
	private String ymqUrl;

	@Field
	private String ymqContent;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYmqTitle() {
		return ymqTitle;
	}

	public void setYmqTitle(String ymqTitle) {
		this.ymqTitle = ymqTitle;
	}

	public String getYmqUrl() {
		return ymqUrl;
	}

	public void setYmqUrl(String ymqUrl) {
		this.ymqUrl = ymqUrl;
	}

	public String getYmqContent() {
		return ymqContent;
	}

	public void setYmqContent(String ymqContent) {
		this.ymqContent = ymqContent;
	}
	
	@Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Ymq [id=");
        builder.append(id);
        builder.append(", ymqTitle=");
        builder.append(ymqTitle);
        builder.append(", ymqUrl=");
        builder.append(ymqUrl);
        builder.append(", ymqContent=");
        builder.append(ymqContent);
        builder.append("]");
        return builder.toString();
    }
	
}
