package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysPost;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysPostToTbSysPostMapperImpl implements SysPostToTbSysPostMapper {

    @Override
    public TbSysPost convert(SysPost arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysPost tbSysPost = new TbSysPost();

        tbSysPost.setCreateDept( arg0.getCreateDept() );
        tbSysPost.setCreateBy( arg0.getCreateBy() );
        tbSysPost.setCreateTime( arg0.getCreateTime() );
        tbSysPost.setUpdateBy( arg0.getUpdateBy() );
        tbSysPost.setUpdateTime( arg0.getUpdateTime() );
        tbSysPost.setId( arg0.getId() );
        tbSysPost.setTenantId( arg0.getTenantId() );
        tbSysPost.setPostCode( arg0.getPostCode() );
        tbSysPost.setPostName( arg0.getPostName() );
        tbSysPost.setPostSort( arg0.getPostSort() );
        tbSysPost.setStatus( arg0.getStatus() );
        tbSysPost.setRemark( arg0.getRemark() );

        return tbSysPost;
    }

    @Override
    public TbSysPost convert(SysPost arg0, TbSysPost arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setPostCode( arg0.getPostCode() );
        arg1.setPostName( arg0.getPostName() );
        arg1.setPostSort( arg0.getPostSort() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
