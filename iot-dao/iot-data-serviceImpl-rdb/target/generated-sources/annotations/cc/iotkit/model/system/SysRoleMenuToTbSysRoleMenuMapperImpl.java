package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysRoleMenu;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysRoleMenuToTbSysRoleMenuMapperImpl implements SysRoleMenuToTbSysRoleMenuMapper {

    @Override
    public TbSysRoleMenu convert(SysRoleMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysRoleMenu tbSysRoleMenu = new TbSysRoleMenu();

        tbSysRoleMenu.setId( arg0.getId() );
        tbSysRoleMenu.setRoleId( arg0.getRoleId() );
        tbSysRoleMenu.setMenuId( arg0.getMenuId() );

        return tbSysRoleMenu;
    }

    @Override
    public TbSysRoleMenu convert(SysRoleMenu arg0, TbSysRoleMenu arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setRoleId( arg0.getRoleId() );
        arg1.setMenuId( arg0.getMenuId() );

        return arg1;
    }
}
