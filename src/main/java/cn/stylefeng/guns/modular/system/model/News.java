package cn.stylefeng.guns.modular.system.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 新闻表
 * </p>
 *
 * @author Yxx
 * @since 2019-03-01
 */
@TableName("sys_news")
public class News extends Model<News> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 新闻标题
     */
    private String title;
    /**
     * 类型
     */
    private Integer type;
    /**
     * 新闻内容
     */
    private String content;
    /**
     * 附加文件
     */
    private String file;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 新闻创建人
     */
    private Integer creater;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreater() {
        return creater;
    }

    public void setCreater(Integer creater) {
        this.creater = creater;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "News{" +
        ", id=" + id +
        ", title=" + title +
        ", type=" + type +
        ", content=" + content +
        ", file=" + file +
        ", createtime=" + createtime +
        ", creater=" + creater +
        "}";
    }
}
