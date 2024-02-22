package io.github.linpeilie;

import cc.iotkit.common.thing.ThingModelMessage;
import cc.iotkit.common.thing.ThingModelMessageToDocThingModelMessageMapper;
import cc.iotkit.model.device.VirtualDeviceLog;
import cc.iotkit.model.device.VirtualDeviceLogToDocVirtualDeviceLogMapper;
import cc.iotkit.model.device.message.DeviceProperty;
import cc.iotkit.model.device.message.DevicePropertyToDocDevicePropertyMapper;
import cc.iotkit.model.rule.RuleLog;
import cc.iotkit.model.rule.RuleLogToDocRuleLogMapper;
import cc.iotkit.model.rule.TaskLog;
import cc.iotkit.model.rule.TaskLogToDocTaskLogMapper;
import cc.iotkit.temporal.es.document.DocDeviceProperty;
import cc.iotkit.temporal.es.document.DocDevicePropertyToDevicePropertyMapper;
import cc.iotkit.temporal.es.document.DocRuleLog;
import cc.iotkit.temporal.es.document.DocRuleLogToRuleLogMapper;
import cc.iotkit.temporal.es.document.DocTaskLog;
import cc.iotkit.temporal.es.document.DocTaskLogToTaskLogMapper;
import cc.iotkit.temporal.es.document.DocThingModelMessage;
import cc.iotkit.temporal.es.document.DocThingModelMessageToThingModelMessageMapper;
import cc.iotkit.temporal.es.document.DocVirtualDeviceLog;
import cc.iotkit.temporal.es.document.DocVirtualDeviceLogToVirtualDeviceLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ConvertMapperAdapter {
  @Autowired
  @Lazy
  private DocDevicePropertyToDevicePropertyMapper docDevicePropertyToDevicePropertyMapper;

  @Autowired
  @Lazy
  private DocThingModelMessageToThingModelMessageMapper docThingModelMessageToThingModelMessageMapper;

  @Autowired
  @Lazy
  private ThingModelMessageToDocThingModelMessageMapper thingModelMessageToDocThingModelMessageMapper;

  @Autowired
  @Lazy
  private DocTaskLogToTaskLogMapper docTaskLogToTaskLogMapper;

  @Autowired
  @Lazy
  private DocVirtualDeviceLogToVirtualDeviceLogMapper docVirtualDeviceLogToVirtualDeviceLogMapper;

  @Autowired
  @Lazy
  private DevicePropertyToDocDevicePropertyMapper devicePropertyToDocDevicePropertyMapper;

  @Autowired
  @Lazy
  private DocRuleLogToRuleLogMapper docRuleLogToRuleLogMapper;

  @Autowired
  @Lazy
  private RuleLogToDocRuleLogMapper ruleLogToDocRuleLogMapper;

  @Autowired
  @Lazy
  private TaskLogToDocTaskLogMapper taskLogToDocTaskLogMapper;

  @Autowired
  @Lazy
  private VirtualDeviceLogToDocVirtualDeviceLogMapper virtualDeviceLogToDocVirtualDeviceLogMapper;

  public DeviceProperty cc_iotkit_temporal_es_document_DocDevicePropertyToDeviceProperty(DocDeviceProperty param) {
    return docDevicePropertyToDevicePropertyMapper.convert(param);}

  public ThingModelMessage cc_iotkit_temporal_es_document_DocThingModelMessageToThingModelMessage(DocThingModelMessage param) {
    return docThingModelMessageToThingModelMessageMapper.convert(param);}

  public DocThingModelMessage cc_iotkit_common_thing_ThingModelMessageToDocThingModelMessage(ThingModelMessage param) {
    return thingModelMessageToDocThingModelMessageMapper.convert(param);}

  public TaskLog cc_iotkit_temporal_es_document_DocTaskLogToTaskLog(DocTaskLog param) {
    return docTaskLogToTaskLogMapper.convert(param);}

  public VirtualDeviceLog cc_iotkit_temporal_es_document_DocVirtualDeviceLogToVirtualDeviceLog(DocVirtualDeviceLog param) {
    return docVirtualDeviceLogToVirtualDeviceLogMapper.convert(param);}

  public DocDeviceProperty cc_iotkit_model_device_message_DevicePropertyToDocDeviceProperty(DeviceProperty param) {
    return devicePropertyToDocDevicePropertyMapper.convert(param);}

  public RuleLog cc_iotkit_temporal_es_document_DocRuleLogToRuleLog(DocRuleLog param) {
    return docRuleLogToRuleLogMapper.convert(param);}

  public DocRuleLog cc_iotkit_model_rule_RuleLogToDocRuleLog(RuleLog param) {
    return ruleLogToDocRuleLogMapper.convert(param);}

  public DocTaskLog cc_iotkit_model_rule_TaskLogToDocTaskLog(TaskLog param) {
    return taskLogToDocTaskLogMapper.convert(param);}

  public DocVirtualDeviceLog cc_iotkit_model_device_VirtualDeviceLogToDocVirtualDeviceLog(VirtualDeviceLog param) {
    return virtualDeviceLogToDocVirtualDeviceLogMapper.convert(param);}
}
