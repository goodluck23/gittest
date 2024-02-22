package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysUserRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysUserRoleToTbSysUserRoleMapperImpl implements SysUserRoleToTbSysUserRoleMapper {

    @Override
    public TbSysUserRole convert(SysUserRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysUserRole tbSysUserRole = new TbSysUserRole();

        tbSysUserRole.setCreateDept( arg0.getCreateDept() );
        tbSysUserRole.setCreateBy( arg0.getCreateBy() );
        tbSysUserRole.setCreateTime( arg0.getCreateTime() );
        tbSysUserRole.setUpdateBy( arg0.getUpdateBy() );
        tbSysUserRole.setUpdateTime( arg0.getUpdateTime() );
        tbSysUserRole.setId( arg0.getId() );
        tbSysUserRole.setUserId( arg0.getUserId() );
        tbSysUserRole.setRoleId( arg0.getRoleId() );

        return tbSysUserRole;
    }

    @Override
    public TbSysUserRole convert(SysUserRole arg0, TbSysUserRole arg1) {
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
        arg1.setRoleId( arg0.getRoleId() );

        return arg1;
    }
}
