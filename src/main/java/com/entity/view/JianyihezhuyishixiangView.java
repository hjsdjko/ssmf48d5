package com.entity.view;

import com.entity.JianyihezhuyishixiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 建议和注意事项
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-12 21:26:48
 */
@TableName("jianyihezhuyishixiang")
public class JianyihezhuyishixiangView  extends JianyihezhuyishixiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JianyihezhuyishixiangView(){
	}
 
 	public JianyihezhuyishixiangView(JianyihezhuyishixiangEntity jianyihezhuyishixiangEntity){
 	try {
			BeanUtils.copyProperties(this, jianyihezhuyishixiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
