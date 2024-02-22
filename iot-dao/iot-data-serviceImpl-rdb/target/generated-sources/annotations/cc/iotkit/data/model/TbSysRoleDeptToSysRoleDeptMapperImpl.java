package cc.iotkit.data.model;

import cc.iotkit.model.system.SysRoleDept;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysRoleDeptToSysRoleDeptMapperImpl implements TbSysRoleDeptToSysRoleDeptMapper {

    @Override
    public SysRoleDept convert(TbSysRoleDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleDept sysRoleDept = new SysRoleDept();

        sysRoleDept.setId( arg0.getId() );
        sysRoleDept.setRoleId( arg0.getRoleId() );
        sysRoleDept.setDeptId( arg0.getDeptId() );

        return sysRoleDept;
    }

    @Override
    public SysRoleDept convert(TbSysRoleDept arg0, SysRoleDept arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setDeptId( arg0.getDeptId() );

        return arg1;
    }
}
