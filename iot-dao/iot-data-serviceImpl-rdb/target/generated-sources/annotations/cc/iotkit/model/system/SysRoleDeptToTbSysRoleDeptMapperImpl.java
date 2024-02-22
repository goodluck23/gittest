package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysRoleDept;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysRoleDeptToTbSysRoleDeptMapperImpl implements SysRoleDeptToTbSysRoleDeptMapper {

    @Override
    public TbSysRoleDept convert(SysRoleDept arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysRoleDept tbSysRoleDept = new TbSysRoleDept();

        tbSysRoleDept.setId( arg0.getId() );
        tbSysRoleDept.setRoleId( arg0.getRoleId() );
        tbSysRoleDept.setDeptId( arg0.getDeptId() );

        return tbSysRoleDept;
    }

    @Override
    public TbSysRoleDept convert(SysRoleDept arg0, TbSysRoleDept arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setDeptId( arg0.getDeptId() );

        return arg1;
    }
}
