package cc.iotkit.data.model;

import cc.iotkit.model.system.SysUserPost;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysUserPostToSysUserPostMapperImpl implements TbSysUserPostToSysUserPostMapper {

    @Override
    public SysUserPost convert(TbSysUserPost arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserPost sysUserPost = new SysUserPost();

        sysUserPost.setCreateDept( arg0.getCreateDept() );
        sysUserPost.setCreateBy( arg0.getCreateBy() );
        sysUserPost.setCreateTime( arg0.getCreateTime() );
        sysUserPost.setUpdateBy( arg0.getUpdateBy() );
        sysUserPost.setUpdateTime( arg0.getUpdateTime() );
        sysUserPost.setId( arg0.getId() );
        sysUserPost.setUserId( arg0.getUserId() );
        sysUserPost.setPostId( arg0.getPostId() );

        return sysUserPost;
    }

    @Override
    public SysUserPost convert(TbSysUserPost arg0, SysUserPost arg1) {
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
