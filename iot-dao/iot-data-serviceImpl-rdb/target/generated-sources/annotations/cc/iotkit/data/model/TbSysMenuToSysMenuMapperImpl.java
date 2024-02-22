package cc.iotkit.data.model;

import cc.iotkit.model.system.SysMenu;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysMenuToSysMenuMapperImpl implements TbSysMenuToSysMenuMapper {

    @Override
    public SysMenu convert(TbSysMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysMenu sysMenu = new SysMenu();

        sysMenu.setCreateDept( arg0.getCreateDept() );
        sysMenu.setCreateBy( arg0.getCreateBy() );
        sysMenu.setUpdateBy( arg0.getUpdateBy() );
        sysMenu.setUpdateTime( arg0.getUpdateTime() );
        sysMenu.setId( arg0.getId() );
        sysMenu.setMenuName( arg0.getMenuName() );
        sysMenu.setParentId( arg0.getParentId() );
        sysMenu.setOrderNum( arg0.getOrderNum() );
        sysMenu.setPath( arg0.getPath() );
        sysMenu.setComponent( arg0.getComponent() );
        sysMenu.setQueryParam( arg0.getQueryParam() );
        sysMenu.setIsFrame( arg0.getIsFrame() );
        sysMenu.setIsCache( arg0.getIsCache() );
        sysMenu.setMenuType( arg0.getMenuType() );
        sysMenu.setVisible( arg0.getVisible() );
        sysMenu.setStatus( arg0.getStatus() );
        sysMenu.setPerms( arg0.getPerms() );
        sysMenu.setIcon( arg0.getIcon() );
        sysMenu.setRemark( arg0.getRemark() );
        sysMenu.setCreateTime( arg0.getCreateTime() );

        return sysMenu;
    }

    @Override
    public SysMenu convert(TbSysMenu arg0, SysMenu arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setMenuName( arg0.getMenuName() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setPath( arg0.getPath() );
        arg1.setComponent( arg0.getComponent() );
        arg1.setQueryParam( arg0.getQueryParam() );
        arg1.setIsFrame( arg0.getIsFrame() );
        arg1.setIsCache( arg0.getIsCache() );
        arg1.setMenuType( arg0.getMenuType() );
        arg1.setVisible( arg0.getVisible() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setPerms( arg0.getPerms() );
        arg1.setIcon( arg0.getIcon() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
