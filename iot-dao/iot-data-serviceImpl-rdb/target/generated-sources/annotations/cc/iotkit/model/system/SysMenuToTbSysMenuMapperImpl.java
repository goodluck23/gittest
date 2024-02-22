package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysMenu;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysMenuToTbSysMenuMapperImpl implements SysMenuToTbSysMenuMapper {

    @Override
    public TbSysMenu convert(SysMenu arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysMenu tbSysMenu = new TbSysMenu();

        tbSysMenu.setCreateDept( arg0.getCreateDept() );
        tbSysMenu.setCreateBy( arg0.getCreateBy() );
        tbSysMenu.setCreateTime( arg0.getCreateTime() );
        tbSysMenu.setUpdateBy( arg0.getUpdateBy() );
        tbSysMenu.setUpdateTime( arg0.getUpdateTime() );
        tbSysMenu.setId( arg0.getId() );
        tbSysMenu.setParentId( arg0.getParentId() );
        tbSysMenu.setMenuName( arg0.getMenuName() );
        tbSysMenu.setOrderNum( arg0.getOrderNum() );
        tbSysMenu.setPath( arg0.getPath() );
        tbSysMenu.setComponent( arg0.getComponent() );
        tbSysMenu.setQueryParam( arg0.getQueryParam() );
        tbSysMenu.setIsFrame( arg0.getIsFrame() );
        tbSysMenu.setIsCache( arg0.getIsCache() );
        tbSysMenu.setMenuType( arg0.getMenuType() );
        tbSysMenu.setVisible( arg0.getVisible() );
        tbSysMenu.setStatus( arg0.getStatus() );
        tbSysMenu.setPerms( arg0.getPerms() );
        tbSysMenu.setIcon( arg0.getIcon() );
        tbSysMenu.setRemark( arg0.getRemark() );

        return tbSysMenu;
    }

    @Override
    public TbSysMenu convert(SysMenu arg0, TbSysMenu arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setMenuName( arg0.getMenuName() );
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

        return arg1;
    }
}
