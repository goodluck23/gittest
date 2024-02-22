package cc.iotkit.data.model;

import cc.iotkit.model.system.SysUserRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysUserRoleToSysUserRoleMapperImpl implements TbSysUserRoleToSysUserRoleMapper {

    @Override
    public SysUserRole convert(TbSysUserRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysUserRole sysUserRole = new SysUserRole();

        sysUserRole.setCreateDept( arg0.getCreateDept() );
        sysUserRole.setCreateBy( arg0.getCreateBy() );
        sysUserRole.setCreateTime( arg0.getCreateTime() );
        sysUserRole.setUpdateBy( arg0.getUpdateBy() );
        sysUserRole.setUpdateTime( arg0.getUpdateTime() );
        sysUserRole.setId( arg0.getId() );
        sysUserRole.setUserId( arg0.getUserId() );
        sysUserRole.setRoleId( arg0.getRoleId() );

        return sysUserRole;
    }

    @Override
    public SysUserRole convert(TbSysUserRole arg0, SysUserRole arg1) {
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
