package cn.stylefeng.guns.modular.system.dao;

import cn.stylefeng.guns.modular.system.model.News;

import org.apache.ibatis.annotations.Param;
import org.terracotta.offheapstore.storage.listener.ListenableStorageEngine;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 新闻表 Mapper 接口
 * </p>
 *
 * @author Yxx
 * @since 2019-03-01
 */
public interface NewsMapper extends BaseMapper<News> {

}
