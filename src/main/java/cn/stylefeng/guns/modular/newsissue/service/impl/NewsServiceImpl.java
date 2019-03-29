package cn.stylefeng.guns.modular.newsissue.service.impl;

import cn.stylefeng.guns.modular.system.model.News;
import cn.stylefeng.guns.modular.system.dao.NewsMapper;
import cn.stylefeng.guns.modular.newsissue.service.INewsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 新闻表 服务实现类
 * </p>
 *
 * @author Yxx
 * @since 2019-03-01
 */
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News> implements INewsService {

}
