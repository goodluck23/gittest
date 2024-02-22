package cc.iotkit.data.model;

import cc.iotkit.model.system.SysRoleMenu;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysRoleMenuToSysRoleMenuMapperImpl implements TbSysRoleMenuToSysRoleMenuMapper {

    @Override
    public SysRoleMenu convert(TbSysRoleMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysRoleMenu sysRoleMenu = new SysRoleMenu();

        sysRoleMenu.setId( arg0.getId() );
        sysRoleMenu.setRoleId( arg0.getRoleId() );
        sysRoleMenu.setMenuId( arg0.getMenuId() );

        return sysRoleMenu;
    }

    @Override
    public SysRoleMenu convert(TbSysRoleMenu arg0, SysRoleMenu arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setMenuId( arg0.getMenuId() );

        return arg1;
    }
}
