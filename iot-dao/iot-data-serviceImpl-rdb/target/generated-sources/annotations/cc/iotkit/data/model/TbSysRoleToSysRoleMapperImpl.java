package cc.iotkit.data.model;

import cc.iotkit.model.system.SysRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysRoleToSysRoleMapperImpl implements TbSysRoleToSysRoleMapper {

    @Override
    public SysRole convert(TbSysRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRole sysRole = new SysRole();

        sysRole.setCreateDept( arg0.getCreateDept() );
        sysRole.setCreateBy( arg0.getCreateBy() );
        sysRole.setUpdateBy( arg0.getUpdateBy() );
        sysRole.setUpdateTime( arg0.getUpdateTime() );
        sysRole.setTenantId( arg0.getTenantId() );
        sysRole.setId( arg0.getId() );
        sysRole.setRoleName( arg0.getRoleName() );
        sysRole.setRoleKey( arg0.getRoleKey() );
        sysRole.setRoleSort( arg0.getRoleSort() );
        sysRole.setDataScope( arg0.getDataScope() );
        sysRole.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        sysRole.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        sysRole.setStatus( arg0.getStatus() );
        sysRole.setRemark( arg0.getRemark() );
        sysRole.setCreateTime( arg0.getCreateTime() );

        return sysRole;
    }

    @Override
    public SysRole convert(TbSysRole arg0, SysRole arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setRoleName( arg0.getRoleName() );
        arg1.setRoleKey( arg0.getRoleKey() );
        arg1.setRoleSort( arg0.getRoleSort() );
        arg1.setDataScope( arg0.getDataScope() );
        arg1.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        arg1.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
