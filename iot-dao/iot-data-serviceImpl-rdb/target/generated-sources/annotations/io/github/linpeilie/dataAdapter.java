package io.github.linpeilie;

import cc.iotkit.data.model.TbAlertConfig;
import cc.iotkit.data.model.TbAlertConfigToAlertConfigMapper;
import cc.iotkit.data.model.TbAlertRecord;
import cc.iotkit.data.model.TbAlertRecordToAlertConfigMapper;
import cc.iotkit.data.model.TbCategory;
import cc.iotkit.data.model.TbCategoryToCategoryMapper;
import cc.iotkit.data.model.TbChannel;
import cc.iotkit.data.model.TbChannelConfig;
import cc.iotkit.data.model.TbChannelConfigToChannelConfigMapper;
import cc.iotkit.data.model.TbChannelTemplate;
import cc.iotkit.data.model.TbChannelTemplateToChannelTemplateMapper;
import cc.iotkit.data.model.TbChannelToChannelMapper;
import cc.iotkit.data.model.TbDeviceConfig;
import cc.iotkit.data.model.TbDeviceConfigToDeviceConfigMapper;
import cc.iotkit.data.model.TbDeviceGroup;
import cc.iotkit.data.model.TbDeviceGroupToDeviceGroupMapper;
import cc.iotkit.data.model.TbDeviceInfo;
import cc.iotkit.data.model.TbDeviceInfoToDeviceInfoMapper;
import cc.iotkit.data.model.TbDeviceOtaDetail;
import cc.iotkit.data.model.TbDeviceOtaDetailToDeviceOtaDetailMapper;
import cc.iotkit.data.model.TbDeviceOtaInfo;
import cc.iotkit.data.model.TbDeviceOtaInfoToDeviceOtaInfoMapper;
import cc.iotkit.data.model.TbHome;
import cc.iotkit.data.model.TbHomeToHomeMapper;
import cc.iotkit.data.model.TbNotifyMessage;
import cc.iotkit.data.model.TbNotifyMessageToNotifyMessageMapper;
import cc.iotkit.data.model.TbOauthClient;
import cc.iotkit.data.model.TbOauthClientToOauthClientMapper;
import cc.iotkit.data.model.TbOtaPackage;
import cc.iotkit.data.model.TbOtaPackageToOtaPackageMapper;
import cc.iotkit.data.model.TbPluginInfo;
import cc.iotkit.data.model.TbPluginInfoToPluginInfoMapper;
import cc.iotkit.data.model.TbPluginInstance;
import cc.iotkit.data.model.TbPluginInstanceToPluginInstanceMapper;
import cc.iotkit.data.model.TbProduct;
import cc.iotkit.data.model.TbProductModel;
import cc.iotkit.data.model.TbProductModelToProductModelMapper;
import cc.iotkit.data.model.TbProductToProductMapper;
import cc.iotkit.data.model.TbRuleInfo;
import cc.iotkit.data.model.TbRuleInfoToRuleInfoMapper;
import cc.iotkit.data.model.TbScreen;
import cc.iotkit.data.model.TbScreenApi;
import cc.iotkit.data.model.TbScreenApiToScreenApiMapper;
import cc.iotkit.data.model.TbScreenToScreenMapper;
import cc.iotkit.data.model.TbSpace;
import cc.iotkit.data.model.TbSpaceDevice;
import cc.iotkit.data.model.TbSpaceDeviceToSpaceDeviceMapper;
import cc.iotkit.data.model.TbSpaceToSpaceMapper;
import cc.iotkit.data.model.TbSysApp;
import cc.iotkit.data.model.TbSysAppToSysAppMapper;
import cc.iotkit.data.model.TbSysConfig;
import cc.iotkit.data.model.TbSysConfigToSysConfigMapper;
import cc.iotkit.data.model.TbSysDept;
import cc.iotkit.data.model.TbSysDeptToSysDeptMapper;
import cc.iotkit.data.model.TbSysDictData;
import cc.iotkit.data.model.TbSysDictDataToSysDictDataMapper;
import cc.iotkit.data.model.TbSysDictType;
import cc.iotkit.data.model.TbSysDictTypeToSysDictTypeMapper;
import cc.iotkit.data.model.TbSysLogininfor;
import cc.iotkit.data.model.TbSysLogininforToSysLoginInfoMapper;
import cc.iotkit.data.model.TbSysMenu;
import cc.iotkit.data.model.TbSysMenuToSysMenuMapper;
import cc.iotkit.data.model.TbSysNotice;
import cc.iotkit.data.model.TbSysNoticeToSysNoticeMapper;
import cc.iotkit.data.model.TbSysOperLog;
import cc.iotkit.data.model.TbSysOperLogToSysOperLogMapper;
import cc.iotkit.data.model.TbSysOss;
import cc.iotkit.data.model.TbSysOssConfig;
import cc.iotkit.data.model.TbSysOssConfigToSysOssConfigMapper;
import cc.iotkit.data.model.TbSysOssToSysOssMapper;
import cc.iotkit.data.model.TbSysPost;
import cc.iotkit.data.model.TbSysPostToSysPostMapper;
import cc.iotkit.data.model.TbSysRole;
import cc.iotkit.data.model.TbSysRoleDept;
import cc.iotkit.data.model.TbSysRoleDeptToSysRoleDeptMapper;
import cc.iotkit.data.model.TbSysRoleMenu;
import cc.iotkit.data.model.TbSysRoleMenuToSysRoleMenuMapper;
import cc.iotkit.data.model.TbSysRoleToSysRoleMapper;
import cc.iotkit.data.model.TbSysTenant;
import cc.iotkit.data.model.TbSysTenantPackage;
import cc.iotkit.data.model.TbSysTenantPackageToSysTenantPackageMapper;
import cc.iotkit.data.model.TbSysTenantToSysTenantMapper;
import cc.iotkit.data.model.TbSysUser;
import cc.iotkit.data.model.TbSysUserPost;
import cc.iotkit.data.model.TbSysUserPostToSysUserPostMapper;
import cc.iotkit.data.model.TbSysUserRole;
import cc.iotkit.data.model.TbSysUserRoleToSysUserRoleMapper;
import cc.iotkit.data.model.TbSysUserToSysUserMapper;
import cc.iotkit.data.model.TbTaskInfo;
import cc.iotkit.data.model.TbTaskInfoToTaskInfoMapper;
import cc.iotkit.data.model.TbThingModel;
import cc.iotkit.data.model.TbThingModelToThingModelMapper;
import cc.iotkit.data.model.TbUserInfo;
import cc.iotkit.data.model.TbUserInfoToUserInfoMapper;
import cc.iotkit.data.model.TbVirtualDevice;
import cc.iotkit.data.model.TbVirtualDeviceToVirtualDeviceMapper;
import cc.iotkit.model.OauthClient;
import cc.iotkit.model.OauthClientToTbOauthClientMapper;
import cc.iotkit.model.UserInfo;
import cc.iotkit.model.UserInfoToTbUserInfoMapper;
import cc.iotkit.model.alert.AlertConfig;
import cc.iotkit.model.alert.AlertConfigToTbAlertConfigMapper;
import cc.iotkit.model.alert.AlertConfigToTbAlertRecordMapper;
import cc.iotkit.model.device.DeviceConfig;
import cc.iotkit.model.device.DeviceConfigToTbDeviceConfigMapper;
import cc.iotkit.model.device.DeviceGroup;
import cc.iotkit.model.device.DeviceGroupToTbDeviceGroupMapper;
import cc.iotkit.model.device.DeviceInfo;
import cc.iotkit.model.device.DeviceInfoToTbDeviceInfoMapper;
import cc.iotkit.model.device.VirtualDevice;
import cc.iotkit.model.device.VirtualDeviceToTbVirtualDeviceMapper;
import cc.iotkit.model.notify.Channel;
import cc.iotkit.model.notify.ChannelConfig;
import cc.iotkit.model.notify.ChannelConfigToTbChannelConfigMapper;
import cc.iotkit.model.notify.ChannelTemplate;
import cc.iotkit.model.notify.ChannelTemplateToTbChannelTemplateMapper;
import cc.iotkit.model.notify.ChannelToTbChannelMapper;
import cc.iotkit.model.notify.NotifyMessage;
import cc.iotkit.model.notify.NotifyMessageToTbNotifyMessageMapper;
import cc.iotkit.model.ota.DeviceOtaDetail;
import cc.iotkit.model.ota.DeviceOtaDetailToTbDeviceOtaDetailMapper;
import cc.iotkit.model.ota.DeviceOtaInfo;
import cc.iotkit.model.ota.DeviceOtaInfoToTbDeviceOtaInfoMapper;
import cc.iotkit.model.ota.OtaPackage;
import cc.iotkit.model.ota.OtaPackageToTbOtaPackageMapper;
import cc.iotkit.model.plugin.PluginInfo;
import cc.iotkit.model.plugin.PluginInfoToTbPluginInfoMapper;
import cc.iotkit.model.plugin.PluginInstance;
import cc.iotkit.model.plugin.PluginInstanceToTbPluginInstanceMapper;
import cc.iotkit.model.product.Category;
import cc.iotkit.model.product.CategoryToTbCategoryMapper;
import cc.iotkit.model.product.Product;
import cc.iotkit.model.product.ProductModel;
import cc.iotkit.model.product.ProductModelToTbProductModelMapper;
import cc.iotkit.model.product.ProductToTbProductMapper;
import cc.iotkit.model.product.ThingModel;
import cc.iotkit.model.product.ThingModelToTbThingModelMapper;
import cc.iotkit.model.rule.RuleInfo;
import cc.iotkit.model.rule.RuleInfoToTbRuleInfoMapper;
import cc.iotkit.model.rule.TaskInfo;
import cc.iotkit.model.rule.TaskInfoToTbTaskInfoMapper;
import cc.iotkit.model.screen.Screen;
import cc.iotkit.model.screen.ScreenApi;
import cc.iotkit.model.screen.ScreenApiToTbScreenApiMapper;
import cc.iotkit.model.screen.ScreenToTbScreenMapper;
import cc.iotkit.model.space.Home;
import cc.iotkit.model.space.HomeToTbHomeMapper;
import cc.iotkit.model.space.Space;
import cc.iotkit.model.space.SpaceDevice;
import cc.iotkit.model.space.SpaceDeviceToTbSpaceDeviceMapper;
import cc.iotkit.model.space.SpaceToTbSpaceMapper;
import cc.iotkit.model.system.SysApp;
import cc.iotkit.model.system.SysAppToTbSysAppMapper;
import cc.iotkit.model.system.SysConfig;
import cc.iotkit.model.system.SysConfigToTbSysConfigMapper;
import cc.iotkit.model.system.SysDept;
import cc.iotkit.model.system.SysDeptToTbSysDeptMapper;
import cc.iotkit.model.system.SysDictData;
import cc.iotkit.model.system.SysDictDataToTbSysDictDataMapper;
import cc.iotkit.model.system.SysDictType;
import cc.iotkit.model.system.SysDictTypeToTbSysDictTypeMapper;
import cc.iotkit.model.system.SysLoginInfo;
import cc.iotkit.model.system.SysLoginInfoToTbSysLogininforMapper;
import cc.iotkit.model.system.SysMenu;
import cc.iotkit.model.system.SysMenuToTbSysMenuMapper;
import cc.iotkit.model.system.SysNotice;
import cc.iotkit.model.system.SysNoticeToTbSysNoticeMapper;
import cc.iotkit.model.system.SysOperLog;
import cc.iotkit.model.system.SysOperLogToTbSysOperLogMapper;
import cc.iotkit.model.system.SysOss;
import cc.iotkit.model.system.SysOssConfig;
import cc.iotkit.model.system.SysOssConfigToTbSysOssConfigMapper;
import cc.iotkit.model.system.SysOssToTbSysOssMapper;
import cc.iotkit.model.system.SysPost;
import cc.iotkit.model.system.SysPostToTbSysPostMapper;
import cc.iotkit.model.system.SysRole;
import cc.iotkit.model.system.SysRoleDept;
import cc.iotkit.model.system.SysRoleDeptToTbSysRoleDeptMapper;
import cc.iotkit.model.system.SysRoleMenu;
import cc.iotkit.model.system.SysRoleMenuToTbSysRoleMenuMapper;
import cc.iotkit.model.system.SysRoleToTbSysRoleMapper;
import cc.iotkit.model.system.SysTenant;
import cc.iotkit.model.system.SysTenantPackage;
import cc.iotkit.model.system.SysTenantPackageToTbSysTenantPackageMapper;
import cc.iotkit.model.system.SysTenantToTbSysTenantMapper;
import cc.iotkit.model.system.SysUser;
import cc.iotkit.model.system.SysUserPost;
import cc.iotkit.model.system.SysUserPostToTbSysUserPostMapper;
import cc.iotkit.model.system.SysUserRole;
import cc.iotkit.model.system.SysUserRoleToTbSysUserRoleMapper;
import cc.iotkit.model.system.SysUserToTbSysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class dataAdapter {
  @Autowired
  @Lazy
  private TbSysTenantPackageToSysTenantPackageMapper tbSysTenantPackageToSysTenantPackageMapper;

  @Autowired
  @Lazy
  private TbSysRoleToSysRoleMapper tbSysRoleToSysRoleMapper;

  @Autowired
  @Lazy
  private TbSysDictTypeToSysDictTypeMapper tbSysDictTypeToSysDictTypeMapper;

  @Autowired
  @Lazy
  private OauthClientToTbOauthClientMapper oauthClientToTbOauthClientMapper;

  @Autowired
  @Lazy
  private SysUserPostToTbSysUserPostMapper sysUserPostToTbSysUserPostMapper;

  @Autowired
  @Lazy
  private TbSysTenantToSysTenantMapper tbSysTenantToSysTenantMapper;

  @Autowired
  @Lazy
  private SysNoticeToTbSysNoticeMapper sysNoticeToTbSysNoticeMapper;

  @Autowired
  @Lazy
  private PluginInstanceToTbPluginInstanceMapper pluginInstanceToTbPluginInstanceMapper;

  @Autowired
  @Lazy
  private SysMenuToTbSysMenuMapper sysMenuToTbSysMenuMapper;

  @Autowired
  @Lazy
  private TbChannelConfigToChannelConfigMapper tbChannelConfigToChannelConfigMapper;

  @Autowired
  @Lazy
  private VirtualDeviceToTbVirtualDeviceMapper virtualDeviceToTbVirtualDeviceMapper;

  @Autowired
  @Lazy
  private TbSysOssToSysOssMapper tbSysOssToSysOssMapper;

  @Autowired
  @Lazy
  private TbDeviceConfigToDeviceConfigMapper tbDeviceConfigToDeviceConfigMapper;

  @Autowired
  @Lazy
  private AlertConfigToTbAlertConfigMapper alertConfigToTbAlertConfigMapper;

  @Autowired
  @Lazy
  private PluginInfoToTbPluginInfoMapper pluginInfoToTbPluginInfoMapper;

  @Autowired
  @Lazy
  private SysOperLogToTbSysOperLogMapper sysOperLogToTbSysOperLogMapper;

  @Autowired
  @Lazy
  private UserInfoToTbUserInfoMapper userInfoToTbUserInfoMapper;

  @Autowired
  @Lazy
  private TbRuleInfoToRuleInfoMapper tbRuleInfoToRuleInfoMapper;

  @Autowired
  @Lazy
  private SysLoginInfoToTbSysLogininforMapper sysLoginInfoToTbSysLogininforMapper;

  @Autowired
  @Lazy
  private AlertConfigToTbAlertRecordMapper alertConfigToTbAlertRecordMapper;

  @Autowired
  @Lazy
  private DeviceOtaDetailToTbDeviceOtaDetailMapper deviceOtaDetailToTbDeviceOtaDetailMapper;

  @Autowired
  @Lazy
  private RuleInfoToTbRuleInfoMapper ruleInfoToTbRuleInfoMapper;

  @Autowired
  @Lazy
  private DeviceGroupToTbDeviceGroupMapper deviceGroupToTbDeviceGroupMapper;

  @Autowired
  @Lazy
  private TbNotifyMessageToNotifyMessageMapper tbNotifyMessageToNotifyMessageMapper;

  @Autowired
  @Lazy
  private TbProductToProductMapper tbProductToProductMapper;

  @Autowired
  @Lazy
  private TaskInfoToTbTaskInfoMapper taskInfoToTbTaskInfoMapper;

  @Autowired
  @Lazy
  private TbPluginInfoToPluginInfoMapper tbPluginInfoToPluginInfoMapper;

  @Autowired
  @Lazy
  private SysDeptToTbSysDeptMapper sysDeptToTbSysDeptMapper;

  @Autowired
  @Lazy
  private SysTenantToTbSysTenantMapper sysTenantToTbSysTenantMapper;

  @Autowired
  @Lazy
  private ThingModelToTbThingModelMapper thingModelToTbThingModelMapper;

  @Autowired
  @Lazy
  private TbSysDeptToSysDeptMapper tbSysDeptToSysDeptMapper;

  @Autowired
  @Lazy
  private TbScreenApiToScreenApiMapper tbScreenApiToScreenApiMapper;

  @Autowired
  @Lazy
  private NotifyMessageToTbNotifyMessageMapper notifyMessageToTbNotifyMessageMapper;

  @Autowired
  @Lazy
  private SysUserRoleToTbSysUserRoleMapper sysUserRoleToTbSysUserRoleMapper;

  @Autowired
  @Lazy
  private ProductModelToTbProductModelMapper productModelToTbProductModelMapper;

  @Autowired
  @Lazy
  private TbPluginInstanceToPluginInstanceMapper tbPluginInstanceToPluginInstanceMapper;

  @Autowired
  @Lazy
  private TbDeviceOtaInfoToDeviceOtaInfoMapper tbDeviceOtaInfoToDeviceOtaInfoMapper;

  @Autowired
  @Lazy
  private TbSysDictDataToSysDictDataMapper tbSysDictDataToSysDictDataMapper;

  @Autowired
  @Lazy
  private TbSysLogininforToSysLoginInfoMapper tbSysLogininforToSysLoginInfoMapper;

  @Autowired
  @Lazy
  private SysUserToTbSysUserMapper sysUserToTbSysUserMapper;

  @Autowired
  @Lazy
  private TbSysRoleDeptToSysRoleDeptMapper tbSysRoleDeptToSysRoleDeptMapper;

  @Autowired
  @Lazy
  private TbDeviceOtaDetailToDeviceOtaDetailMapper tbDeviceOtaDetailToDeviceOtaDetailMapper;

  @Autowired
  @Lazy
  private TbOtaPackageToOtaPackageMapper tbOtaPackageToOtaPackageMapper;

  @Autowired
  @Lazy
  private TbSysConfigToSysConfigMapper tbSysConfigToSysConfigMapper;

  @Autowired
  @Lazy
  private TbSysUserPostToSysUserPostMapper tbSysUserPostToSysUserPostMapper;

  @Autowired
  @Lazy
  private SysTenantPackageToTbSysTenantPackageMapper sysTenantPackageToTbSysTenantPackageMapper;

  @Autowired
  @Lazy
  private DeviceOtaInfoToTbDeviceOtaInfoMapper deviceOtaInfoToTbDeviceOtaInfoMapper;

  @Autowired
  @Lazy
  private TbProductModelToProductModelMapper tbProductModelToProductModelMapper;

  @Autowired
  @Lazy
  private TbThingModelToThingModelMapper tbThingModelToThingModelMapper;

  @Autowired
  @Lazy
  private SysPostToTbSysPostMapper sysPostToTbSysPostMapper;

  @Autowired
  @Lazy
  private TbSysMenuToSysMenuMapper tbSysMenuToSysMenuMapper;

  @Autowired
  @Lazy
  private ProductToTbProductMapper productToTbProductMapper;

  @Autowired
  @Lazy
  private SysDictTypeToTbSysDictTypeMapper sysDictTypeToTbSysDictTypeMapper;

  @Autowired
  @Lazy
  private TbSysAppToSysAppMapper tbSysAppToSysAppMapper;

  @Autowired
  @Lazy
  private TbUserInfoToUserInfoMapper tbUserInfoToUserInfoMapper;

  @Autowired
  @Lazy
  private TbVirtualDeviceToVirtualDeviceMapper tbVirtualDeviceToVirtualDeviceMapper;

  @Autowired
  @Lazy
  private ScreenToTbScreenMapper screenToTbScreenMapper;

  @Autowired
  @Lazy
  private SysRoleToTbSysRoleMapper sysRoleToTbSysRoleMapper;

  @Autowired
  @Lazy
  private TbChannelTemplateToChannelTemplateMapper tbChannelTemplateToChannelTemplateMapper;

  @Autowired
  @Lazy
  private HomeToTbHomeMapper homeToTbHomeMapper;

  @Autowired
  @Lazy
  private TbSysPostToSysPostMapper tbSysPostToSysPostMapper;

  @Autowired
  @Lazy
  private TbAlertRecordToAlertConfigMapper tbAlertRecordToAlertConfigMapper;

  @Autowired
  @Lazy
  private TbChannelToChannelMapper tbChannelToChannelMapper;

  @Autowired
  @Lazy
  private SysOssConfigToTbSysOssConfigMapper sysOssConfigToTbSysOssConfigMapper;

  @Autowired
  @Lazy
  private TbSysNoticeToSysNoticeMapper tbSysNoticeToSysNoticeMapper;

  @Autowired
  @Lazy
  private TbSysRoleMenuToSysRoleMenuMapper tbSysRoleMenuToSysRoleMenuMapper;

  @Autowired
  @Lazy
  private SysOssToTbSysOssMapper sysOssToTbSysOssMapper;

  @Autowired
  @Lazy
  private SpaceToTbSpaceMapper spaceToTbSpaceMapper;

  @Autowired
  @Lazy
  private TbSpaceToSpaceMapper tbSpaceToSpaceMapper;

  @Autowired
  @Lazy
  private SpaceDeviceToTbSpaceDeviceMapper spaceDeviceToTbSpaceDeviceMapper;

  @Autowired
  @Lazy
  private TbAlertConfigToAlertConfigMapper tbAlertConfigToAlertConfigMapper;

  @Autowired
  @Lazy
  private TbSysUserRoleToSysUserRoleMapper tbSysUserRoleToSysUserRoleMapper;

  @Autowired
  @Lazy
  private TbDeviceInfoToDeviceInfoMapper tbDeviceInfoToDeviceInfoMapper;

  @Autowired
  @Lazy
  private SysAppToTbSysAppMapper sysAppToTbSysAppMapper;

  @Autowired
  @Lazy
  private ChannelToTbChannelMapper channelToTbChannelMapper;

  @Autowired
  @Lazy
  private TbSysOperLogToSysOperLogMapper tbSysOperLogToSysOperLogMapper;

  @Autowired
  @Lazy
  private DeviceInfoToTbDeviceInfoMapper deviceInfoToTbDeviceInfoMapper;

  @Autowired
  @Lazy
  private SysRoleDeptToTbSysRoleDeptMapper sysRoleDeptToTbSysRoleDeptMapper;

  @Autowired
  @Lazy
  private SysRoleMenuToTbSysRoleMenuMapper sysRoleMenuToTbSysRoleMenuMapper;

  @Autowired
  @Lazy
  private TbSysUserToSysUserMapper tbSysUserToSysUserMapper;

  @Autowired
  @Lazy
  private ScreenApiToTbScreenApiMapper screenApiToTbScreenApiMapper;

  @Autowired
  @Lazy
  private CategoryToTbCategoryMapper categoryToTbCategoryMapper;

  @Autowired
  @Lazy
  private SysConfigToTbSysConfigMapper sysConfigToTbSysConfigMapper;

  @Autowired
  @Lazy
  private TbOauthClientToOauthClientMapper tbOauthClientToOauthClientMapper;

  @Autowired
  @Lazy
  private TbTaskInfoToTaskInfoMapper tbTaskInfoToTaskInfoMapper;

  @Autowired
  @Lazy
  private OtaPackageToTbOtaPackageMapper otaPackageToTbOtaPackageMapper;

  @Autowired
  @Lazy
  private TbSysOssConfigToSysOssConfigMapper tbSysOssConfigToSysOssConfigMapper;

  @Autowired
  @Lazy
  private DeviceConfigToTbDeviceConfigMapper deviceConfigToTbDeviceConfigMapper;

  @Autowired
  @Lazy
  private TbCategoryToCategoryMapper tbCategoryToCategoryMapper;

  @Autowired
  @Lazy
  private TbDeviceGroupToDeviceGroupMapper tbDeviceGroupToDeviceGroupMapper;

  @Autowired
  @Lazy
  private ChannelTemplateToTbChannelTemplateMapper channelTemplateToTbChannelTemplateMapper;

  @Autowired
  @Lazy
  private TbHomeToHomeMapper tbHomeToHomeMapper;

  @Autowired
  @Lazy
  private TbScreenToScreenMapper tbScreenToScreenMapper;

  @Autowired
  @Lazy
  private SysDictDataToTbSysDictDataMapper sysDictDataToTbSysDictDataMapper;

  @Autowired
  @Lazy
  private TbSpaceDeviceToSpaceDeviceMapper tbSpaceDeviceToSpaceDeviceMapper;

  @Autowired
  @Lazy
  private ChannelConfigToTbChannelConfigMapper channelConfigToTbChannelConfigMapper;

  public SysTenantPackage cc_iotkit_data_model_TbSysTenantPackageToSysTenantPackage(TbSysTenantPackage param) {
    return tbSysTenantPackageToSysTenantPackageMapper.convert(param);}

  public SysRole cc_iotkit_data_model_TbSysRoleToSysRole(TbSysRole param) {
    return tbSysRoleToSysRoleMapper.convert(param);}

  public SysDictType cc_iotkit_data_model_TbSysDictTypeToSysDictType(TbSysDictType param) {
    return tbSysDictTypeToSysDictTypeMapper.convert(param);}

  public TbOauthClient cc_iotkit_model_OauthClientToTbOauthClient(OauthClient param) {
    return oauthClientToTbOauthClientMapper.convert(param);}

  public TbSysUserPost cc_iotkit_model_system_SysUserPostToTbSysUserPost(SysUserPost param) {
    return sysUserPostToTbSysUserPostMapper.convert(param);}

  public SysTenant cc_iotkit_data_model_TbSysTenantToSysTenant(TbSysTenant param) {
    return tbSysTenantToSysTenantMapper.convert(param);}

  public TbSysNotice cc_iotkit_model_system_SysNoticeToTbSysNotice(SysNotice param) {
    return sysNoticeToTbSysNoticeMapper.convert(param);}

  public TbPluginInstance cc_iotkit_model_plugin_PluginInstanceToTbPluginInstance(PluginInstance param) {
    return pluginInstanceToTbPluginInstanceMapper.convert(param);}

  public TbSysMenu cc_iotkit_model_system_SysMenuToTbSysMenu(SysMenu param) {
    return sysMenuToTbSysMenuMapper.convert(param);}

  public ChannelConfig cc_iotkit_data_model_TbChannelConfigToChannelConfig(TbChannelConfig param) {
    return tbChannelConfigToChannelConfigMapper.convert(param);}

  public TbVirtualDevice cc_iotkit_model_device_VirtualDeviceToTbVirtualDevice(VirtualDevice param) {
    return virtualDeviceToTbVirtualDeviceMapper.convert(param);}

  public SysOss cc_iotkit_data_model_TbSysOssToSysOss(TbSysOss param) {
    return tbSysOssToSysOssMapper.convert(param);}

  public DeviceConfig cc_iotkit_data_model_TbDeviceConfigToDeviceConfig(TbDeviceConfig param) {
    return tbDeviceConfigToDeviceConfigMapper.convert(param);}

  public TbAlertConfig cc_iotkit_model_alert_AlertConfigToTbAlertConfig(AlertConfig param) {
    return alertConfigToTbAlertConfigMapper.convert(param);}

  public TbPluginInfo cc_iotkit_model_plugin_PluginInfoToTbPluginInfo(PluginInfo param) {
    return pluginInfoToTbPluginInfoMapper.convert(param);}

  public TbSysOperLog cc_iotkit_model_system_SysOperLogToTbSysOperLog(SysOperLog param) {
    return sysOperLogToTbSysOperLogMapper.convert(param);}

  public TbUserInfo cc_iotkit_model_UserInfoToTbUserInfo(UserInfo param) {
    return userInfoToTbUserInfoMapper.convert(param);}

  public RuleInfo cc_iotkit_data_model_TbRuleInfoToRuleInfo(TbRuleInfo param) {
    return tbRuleInfoToRuleInfoMapper.convert(param);}

  public TbSysLogininfor cc_iotkit_model_system_SysLoginInfoToTbSysLogininfor(SysLoginInfo param) {
    return sysLoginInfoToTbSysLogininforMapper.convert(param);}

  public TbAlertRecord cc_iotkit_model_alert_AlertConfigToTbAlertRecord(AlertConfig param) {
    return alertConfigToTbAlertRecordMapper.convert(param);}

  public TbDeviceOtaDetail cc_iotkit_model_ota_DeviceOtaDetailToTbDeviceOtaDetail(DeviceOtaDetail param) {
    return deviceOtaDetailToTbDeviceOtaDetailMapper.convert(param);}

  public TbRuleInfo cc_iotkit_model_rule_RuleInfoToTbRuleInfo(RuleInfo param) {
    return ruleInfoToTbRuleInfoMapper.convert(param);}

  public TbDeviceGroup cc_iotkit_model_device_DeviceGroupToTbDeviceGroup(DeviceGroup param) {
    return deviceGroupToTbDeviceGroupMapper.convert(param);}

  public NotifyMessage cc_iotkit_data_model_TbNotifyMessageToNotifyMessage(TbNotifyMessage param) {
    return tbNotifyMessageToNotifyMessageMapper.convert(param);}

  public Product cc_iotkit_data_model_TbProductToProduct(TbProduct param) {
    return tbProductToProductMapper.convert(param);}

  public TbTaskInfo cc_iotkit_model_rule_TaskInfoToTbTaskInfo(TaskInfo param) {
    return taskInfoToTbTaskInfoMapper.convert(param);}

  public PluginInfo cc_iotkit_data_model_TbPluginInfoToPluginInfo(TbPluginInfo param) {
    return tbPluginInfoToPluginInfoMapper.convert(param);}

  public TbSysDept cc_iotkit_model_system_SysDeptToTbSysDept(SysDept param) {
    return sysDeptToTbSysDeptMapper.convert(param);}

  public TbSysTenant cc_iotkit_model_system_SysTenantToTbSysTenant(SysTenant param) {
    return sysTenantToTbSysTenantMapper.convert(param);}

  public TbThingModel cc_iotkit_model_product_ThingModelToTbThingModel(ThingModel param) {
    return thingModelToTbThingModelMapper.convert(param);}

  public SysDept cc_iotkit_data_model_TbSysDeptToSysDept(TbSysDept param) {
    return tbSysDeptToSysDeptMapper.convert(param);}

  public ScreenApi cc_iotkit_data_model_TbScreenApiToScreenApi(TbScreenApi param) {
    return tbScreenApiToScreenApiMapper.convert(param);}

  public TbNotifyMessage cc_iotkit_model_notify_NotifyMessageToTbNotifyMessage(NotifyMessage param) {
    return notifyMessageToTbNotifyMessageMapper.convert(param);}

  public TbSysUserRole cc_iotkit_model_system_SysUserRoleToTbSysUserRole(SysUserRole param) {
    return sysUserRoleToTbSysUserRoleMapper.convert(param);}

  public TbProductModel cc_iotkit_model_product_ProductModelToTbProductModel(ProductModel param) {
    return productModelToTbProductModelMapper.convert(param);}

  public PluginInstance cc_iotkit_data_model_TbPluginInstanceToPluginInstance(TbPluginInstance param) {
    return tbPluginInstanceToPluginInstanceMapper.convert(param);}

  public DeviceOtaInfo cc_iotkit_data_model_TbDeviceOtaInfoToDeviceOtaInfo(TbDeviceOtaInfo param) {
    return tbDeviceOtaInfoToDeviceOtaInfoMapper.convert(param);}

  public SysDictData cc_iotkit_data_model_TbSysDictDataToSysDictData(TbSysDictData param) {
    return tbSysDictDataToSysDictDataMapper.convert(param);}

  public SysLoginInfo cc_iotkit_data_model_TbSysLogininforToSysLoginInfo(TbSysLogininfor param) {
    return tbSysLogininforToSysLoginInfoMapper.convert(param);}

  public TbSysUser cc_iotkit_model_system_SysUserToTbSysUser(SysUser param) {
    return sysUserToTbSysUserMapper.convert(param);}

  public SysRoleDept cc_iotkit_data_model_TbSysRoleDeptToSysRoleDept(TbSysRoleDept param) {
    return tbSysRoleDeptToSysRoleDeptMapper.convert(param);}

  public DeviceOtaDetail cc_iotkit_data_model_TbDeviceOtaDetailToDeviceOtaDetail(TbDeviceOtaDetail param) {
    return tbDeviceOtaDetailToDeviceOtaDetailMapper.convert(param);}

  public OtaPackage cc_iotkit_data_model_TbOtaPackageToOtaPackage(TbOtaPackage param) {
    return tbOtaPackageToOtaPackageMapper.convert(param);}

  public SysConfig cc_iotkit_data_model_TbSysConfigToSysConfig(TbSysConfig param) {
    return tbSysConfigToSysConfigMapper.convert(param);}

  public SysUserPost cc_iotkit_data_model_TbSysUserPostToSysUserPost(TbSysUserPost param) {
    return tbSysUserPostToSysUserPostMapper.convert(param);}

  public TbSysTenantPackage cc_iotkit_model_system_SysTenantPackageToTbSysTenantPackage(SysTenantPackage param) {
    return sysTenantPackageToTbSysTenantPackageMapper.convert(param);}

  public TbDeviceOtaInfo cc_iotkit_model_ota_DeviceOtaInfoToTbDeviceOtaInfo(DeviceOtaInfo param) {
    return deviceOtaInfoToTbDeviceOtaInfoMapper.convert(param);}

  public ProductModel cc_iotkit_data_model_TbProductModelToProductModel(TbProductModel param) {
    return tbProductModelToProductModelMapper.convert(param);}

  public ThingModel cc_iotkit_data_model_TbThingModelToThingModel(TbThingModel param) {
    return tbThingModelToThingModelMapper.convert(param);}

  public TbSysPost cc_iotkit_model_system_SysPostToTbSysPost(SysPost param) {
    return sysPostToTbSysPostMapper.convert(param);}

  public SysMenu cc_iotkit_data_model_TbSysMenuToSysMenu(TbSysMenu param) {
    return tbSysMenuToSysMenuMapper.convert(param);}

  public TbProduct cc_iotkit_model_product_ProductToTbProduct(Product param) {
    return productToTbProductMapper.convert(param);}

  public TbSysDictType cc_iotkit_model_system_SysDictTypeToTbSysDictType(SysDictType param) {
    return sysDictTypeToTbSysDictTypeMapper.convert(param);}

  public SysApp cc_iotkit_data_model_TbSysAppToSysApp(TbSysApp param) {
    return tbSysAppToSysAppMapper.convert(param);}

  public UserInfo cc_iotkit_data_model_TbUserInfoToUserInfo(TbUserInfo param) {
    return tbUserInfoToUserInfoMapper.convert(param);}

  public VirtualDevice cc_iotkit_data_model_TbVirtualDeviceToVirtualDevice(TbVirtualDevice param) {
    return tbVirtualDeviceToVirtualDeviceMapper.convert(param);}

  public TbScreen cc_iotkit_model_screen_ScreenToTbScreen(Screen param) {
    return screenToTbScreenMapper.convert(param);}

  public TbSysRole cc_iotkit_model_system_SysRoleToTbSysRole(SysRole param) {
    return sysRoleToTbSysRoleMapper.convert(param);}

  public ChannelTemplate cc_iotkit_data_model_TbChannelTemplateToChannelTemplate(TbChannelTemplate param) {
    return tbChannelTemplateToChannelTemplateMapper.convert(param);}

  public TbHome cc_iotkit_model_space_HomeToTbHome(Home param) {
    return homeToTbHomeMapper.convert(param);}

  public SysPost cc_iotkit_data_model_TbSysPostToSysPost(TbSysPost param) {
    return tbSysPostToSysPostMapper.convert(param);}

  public AlertConfig cc_iotkit_data_model_TbAlertRecordToAlertConfig(TbAlertRecord param) {
    return tbAlertRecordToAlertConfigMapper.convert(param);}

  public Channel cc_iotkit_data_model_TbChannelToChannel(TbChannel param) {
    return tbChannelToChannelMapper.convert(param);}

  public TbSysOssConfig cc_iotkit_model_system_SysOssConfigToTbSysOssConfig(SysOssConfig param) {
    return sysOssConfigToTbSysOssConfigMapper.convert(param);}

  public SysNotice cc_iotkit_data_model_TbSysNoticeToSysNotice(TbSysNotice param) {
    return tbSysNoticeToSysNoticeMapper.convert(param);}

  public SysRoleMenu cc_iotkit_data_model_TbSysRoleMenuToSysRoleMenu(TbSysRoleMenu param) {
    return tbSysRoleMenuToSysRoleMenuMapper.convert(param);}

  public TbSysOss cc_iotkit_model_system_SysOssToTbSysOss(SysOss param) {
    return sysOssToTbSysOssMapper.convert(param);}

  public TbSpace cc_iotkit_model_space_SpaceToTbSpace(Space param) {
    return spaceToTbSpaceMapper.convert(param);}

  public Space cc_iotkit_data_model_TbSpaceToSpace(TbSpace param) {
    return tbSpaceToSpaceMapper.convert(param);}

  public TbSpaceDevice cc_iotkit_model_space_SpaceDeviceToTbSpaceDevice(SpaceDevice param) {
    return spaceDeviceToTbSpaceDeviceMapper.convert(param);}

  public AlertConfig cc_iotkit_data_model_TbAlertConfigToAlertConfig(TbAlertConfig param) {
    return tbAlertConfigToAlertConfigMapper.convert(param);}

  public SysUserRole cc_iotkit_data_model_TbSysUserRoleToSysUserRole(TbSysUserRole param) {
    return tbSysUserRoleToSysUserRoleMapper.convert(param);}

  public DeviceInfo cc_iotkit_data_model_TbDeviceInfoToDeviceInfo(TbDeviceInfo param) {
    return tbDeviceInfoToDeviceInfoMapper.convert(param);}

  public TbSysApp cc_iotkit_model_system_SysAppToTbSysApp(SysApp param) {
    return sysAppToTbSysAppMapper.convert(param);}

  public TbChannel cc_iotkit_model_notify_ChannelToTbChannel(Channel param) {
    return channelToTbChannelMapper.convert(param);}

  public SysOperLog cc_iotkit_data_model_TbSysOperLogToSysOperLog(TbSysOperLog param) {
    return tbSysOperLogToSysOperLogMapper.convert(param);}

  public TbDeviceInfo cc_iotkit_model_device_DeviceInfoToTbDeviceInfo(DeviceInfo param) {
    return deviceInfoToTbDeviceInfoMapper.convert(param);}

  public TbSysRoleDept cc_iotkit_model_system_SysRoleDeptToTbSysRoleDept(SysRoleDept param) {
    return sysRoleDeptToTbSysRoleDeptMapper.convert(param);}

  public TbSysRoleMenu cc_iotkit_model_system_SysRoleMenuToTbSysRoleMenu(SysRoleMenu param) {
    return sysRoleMenuToTbSysRoleMenuMapper.convert(param);}

  public SysUser cc_iotkit_data_model_TbSysUserToSysUser(TbSysUser param) {
    return tbSysUserToSysUserMapper.convert(param);}

  public TbScreenApi cc_iotkit_model_screen_ScreenApiToTbScreenApi(ScreenApi param) {
    return screenApiToTbScreenApiMapper.convert(param);}

  public TbCategory cc_iotkit_model_product_CategoryToTbCategory(Category param) {
    return categoryToTbCategoryMapper.convert(param);}

  public TbSysConfig cc_iotkit_model_system_SysConfigToTbSysConfig(SysConfig param) {
    return sysConfigToTbSysConfigMapper.convert(param);}

  public OauthClient cc_iotkit_data_model_TbOauthClientToOauthClient(TbOauthClient param) {
    return tbOauthClientToOauthClientMapper.convert(param);}

  public TaskInfo cc_iotkit_data_model_TbTaskInfoToTaskInfo(TbTaskInfo param) {
    return tbTaskInfoToTaskInfoMapper.convert(param);}

  public TbOtaPackage cc_iotkit_model_ota_OtaPackageToTbOtaPackage(OtaPackage param) {
    return otaPackageToTbOtaPackageMapper.convert(param);}

  public SysOssConfig cc_iotkit_data_model_TbSysOssConfigToSysOssConfig(TbSysOssConfig param) {
    return tbSysOssConfigToSysOssConfigMapper.convert(param);}

  public TbDeviceConfig cc_iotkit_model_device_DeviceConfigToTbDeviceConfig(DeviceConfig param) {
    return deviceConfigToTbDeviceConfigMapper.convert(param);}

  public Category cc_iotkit_data_model_TbCategoryToCategory(TbCategory param) {
    return tbCategoryToCategoryMapper.convert(param);}

  public DeviceGroup cc_iotkit_data_model_TbDeviceGroupToDeviceGroup(TbDeviceGroup param) {
    return tbDeviceGroupToDeviceGroupMapper.convert(param);}

  public TbChannelTemplate cc_iotkit_model_notify_ChannelTemplateToTbChannelTemplate(ChannelTemplate param) {
    return channelTemplateToTbChannelTemplateMapper.convert(param);}

  public Home cc_iotkit_data_model_TbHomeToHome(TbHome param) {
    return tbHomeToHomeMapper.convert(param);}

  public Screen cc_iotkit_data_model_TbScreenToScreen(TbScreen param) {
    return tbScreenToScreenMapper.convert(param);}

  public TbSysDictData cc_iotkit_model_system_SysDictDataToTbSysDictData(SysDictData param) {
    return sysDictDataToTbSysDictDataMapper.convert(param);}

  public SpaceDevice cc_iotkit_data_model_TbSpaceDeviceToSpaceDevice(TbSpaceDevice param) {
    return tbSpaceDeviceToSpaceDeviceMapper.convert(param);}

  public TbChannelConfig cc_iotkit_model_notify_ChannelConfigToTbChannelConfig(ChannelConfig param) {
    return channelConfigToTbChannelConfigMapper.convert(param);}
}
