// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryManagementClient.proto

package ds.inventoryManagementSystem.grpc.generated;

public final class InventoryManagementClient {
  private InventoryManagementClient() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037InventoryManagementClient.proto\022+ds.in" +
      "ventoryManagementSystem.grpc.generated\"0" +
      "\n\033CheckProductQuantityRequest\022\021\n\tproduct" +
      "Id\030\001 \001(\t\"7\n\034CheckProductQuantityResponse" +
      "\022\027\n\017productQuantity\030\001 \001(\001\"Y\n\031SetProductQ" +
      "uantityRequest\022\021\n\tproductId\030\001 \001(\t\022\020\n\010Qua" +
      "ntity\030\002 \001(\001\022\027\n\017isSentByPrimary\030\003 \001(\010\",\n\032" +
      "SetProductQuantityResponse\022\016\n\006status\030\001 \001" +
      "(\010\"$\n\021CheckOrderRequest\022\017\n\007orderId\030\001 \001(\t" +
      "\"B\n\022CheckOrderResponse\022\023\n\013productName\030\001 " +
      "\001(\t\022\027\n\017productQuantity\030\002 \001(\001\"i\n\017SetOrder" +
      "Request\022\017\n\007orderId\030\001 \001(\t\022\023\n\013productName\030" +
      "\002 \001(\t\022\027\n\017productQuantity\030\003 \001(\001\022\027\n\017isSent" +
      "ByPrimary\030\004 \001(\010\"\"\n\020SetOrderResponse\022\016\n\006s" +
      "tatus\030\001 \001(\0102\313\001\n\033CheckProductQuantityServ" +
      "ice\022\253\001\n\024checkProductQuantity\022H.ds.invent" +
      "oryManagementSystem.grpc.generated.Check" +
      "ProductQuantityRequest\032I.ds.inventoryMan" +
      "agementSystem.grpc.generated.CheckProduc" +
      "tQuantityResponse2\303\001\n\031SetProductQuantity" +
      "Service\022\245\001\n\022setProductQuantity\022F.ds.inve" +
      "ntoryManagementSystem.grpc.generated.Set" +
      "ProductQuantityRequest\032G.ds.inventoryMan" +
      "agementSystem.grpc.generated.SetProductQ" +
      "uantityResponse2\244\001\n\021CheckOrderService\022\216\001" +
      "\n\013checkOrders\022>.ds.inventoryManagementSy" +
      "stem.grpc.generated.CheckOrderRequest\032?." +
      "ds.inventoryManagementSystem.grpc.genera" +
      "ted.CheckOrderResponse2\234\001\n\017SetOrderServi" +
      "ce\022\210\001\n\tsetOrders\022<.ds.inventoryManagemen" +
      "tSystem.grpc.generated.SetOrderRequest\032=" +
      ".ds.inventoryManagementSystem.grpc.gener" +
      "ated.SetOrderResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityRequest_descriptor,
        new java.lang.String[] { "ProductId", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_CheckProductQuantityResponse_descriptor,
        new java.lang.String[] { "ProductQuantity", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityRequest_descriptor,
        new java.lang.String[] { "ProductId", "Quantity", "IsSentByPrimary", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_SetProductQuantityResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor,
        new java.lang.String[] { "ProductName", "ProductQuantity", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderRequest_descriptor,
        new java.lang.String[] { "OrderId", "ProductName", "ProductQuantity", "IsSentByPrimary", });
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ds_inventoryManagementSystem_grpc_generated_SetOrderResponse_descriptor,
        new java.lang.String[] { "Status", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
