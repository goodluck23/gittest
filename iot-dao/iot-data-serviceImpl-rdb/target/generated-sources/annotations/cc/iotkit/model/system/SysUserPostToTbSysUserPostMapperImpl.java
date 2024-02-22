package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysUserPost;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysUserPostToTbSysUserPostMapperImpl implements SysUserPostToTbSysUserPostMapper {

    @Override
    public TbSysUserPost convert(SysUserPost arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysUserPost tbSysUserPost = new TbSysUserPost();

        tbSysUserPost.setCreateDept( arg0.getCreateDept() );
        tbSysUserPost.setCreateBy( arg0.getCreateBy() );
        tbSysUserPost.setCreateTime( arg0.getCreateTime() );
        tbSysUserPost.setUpdateBy( arg0.getUpdateBy() );
        tbSysUserPost.setUpdateTime( arg0.getUpdateTime() );
        tbSysUserPost.setId( arg0.getId() );
        tbSysUserPost.setUserId( arg0.getUserId() );
        tbSysUserPost.setPostId( arg0.getPostId() );

        return tbSysUserPost;
    }

    @Override
    public TbSysUserPost convert(SysUserPost arg0, TbSysUserPost arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setPostId( arg0.getPostId() );

        return arg1;
    }
}
