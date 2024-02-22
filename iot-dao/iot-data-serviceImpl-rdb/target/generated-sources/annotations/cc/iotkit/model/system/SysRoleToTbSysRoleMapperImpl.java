package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysRole;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysRoleToTbSysRoleMapperImpl implements SysRoleToTbSysRoleMapper {

    @Override
    public TbSysRole convert(SysRole arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysRole tbSysRole = new TbSysRole();

        tbSysRole.setCreateDept( arg0.getCreateDept() );
        tbSysRole.setCreateBy( arg0.getCreateBy() );
        tbSysRole.setCreateTime( arg0.getCreateTime() );
        tbSysRole.setUpdateBy( arg0.getUpdateBy() );
        tbSysRole.setUpdateTime( arg0.getUpdateTime() );
        tbSysRole.setId( arg0.getId() );
        tbSysRole.setTenantId( arg0.getTenantId() );
        tbSysRole.setRoleName( arg0.getRoleName() );
        tbSysRole.setRoleKey( arg0.getRoleKey() );
        tbSysRole.setRoleSort( arg0.getRoleSort() );
        tbSysRole.setDataScope( arg0.getDataScope() );
        tbSysRole.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        tbSysRole.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        tbSysRole.setStatus( arg0.getStatus() );
        tbSysRole.setRemark( arg0.getRemark() );

        return tbSysRole;
    }

    @Override
    public TbSysRole convert(SysRole arg0, TbSysRole arg1) {
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
        arg1.setRoleName( arg0.getRoleName() );
        arg1.setRoleKey( arg0.getRoleKey() );
        arg1.setRoleSort( arg0.getRoleSort() );
        arg1.setDataScope( arg0.getDataScope() );
        arg1.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        arg1.setDeptCheckStrictly( arg0.getDeptCheckStrictly() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
