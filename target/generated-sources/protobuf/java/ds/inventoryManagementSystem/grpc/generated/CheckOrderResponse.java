// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InventoryManagementClient.proto

package ds.inventoryManagementSystem.grpc.generated;

/**
 * Protobuf type {@code ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse}
 */
public final class CheckOrderResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)
    CheckOrderResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckOrderResponse.newBuilder() to construct.
  private CheckOrderResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckOrderResponse() {
    productName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CheckOrderResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckOrderResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            productName_ = s;
            break;
          }
          case 17: {

            productQuantity_ = input.readDouble();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ds.inventoryManagementSystem.grpc.generated.InventoryManagementClient.internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ds.inventoryManagementSystem.grpc.generated.InventoryManagementClient.internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.class, ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.Builder.class);
  }

  public static final int PRODUCTNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object productName_;
  /**
   * <code>string productName = 1;</code>
   * @return The productName.
   */
  @java.lang.Override
  public java.lang.String getProductName() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productName_ = s;
      return s;
    }
  }
  /**
   * <code>string productName = 1;</code>
   * @return The bytes for productName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProductNameBytes() {
    java.lang.Object ref = productName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRODUCTQUANTITY_FIELD_NUMBER = 2;
  private double productQuantity_;
  /**
   * <code>double productQuantity = 2;</code>
   * @return The productQuantity.
   */
  @java.lang.Override
  public double getProductQuantity() {
    return productQuantity_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getProductNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productName_);
    }
    if (productQuantity_ != 0D) {
      output.writeDouble(2, productQuantity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productName_);
    }
    if (productQuantity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, productQuantity_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)) {
      return super.equals(obj);
    }
    ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse other = (ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse) obj;

    if (!getProductName()
        .equals(other.getProductName())) return false;
    if (java.lang.Double.doubleToLongBits(getProductQuantity())
        != java.lang.Double.doubleToLongBits(
            other.getProductQuantity())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PRODUCTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProductName().hashCode();
    hash = (37 * hash) + PRODUCTQUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getProductQuantity()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)
      ds.inventoryManagementSystem.grpc.generated.CheckOrderResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ds.inventoryManagementSystem.grpc.generated.InventoryManagementClient.internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ds.inventoryManagementSystem.grpc.generated.InventoryManagementClient.internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.class, ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.Builder.class);
    }

    // Construct using ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productName_ = "";

      productQuantity_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ds.inventoryManagementSystem.grpc.generated.InventoryManagementClient.internal_static_ds_inventoryManagementSystem_grpc_generated_CheckOrderResponse_descriptor;
    }

    @java.lang.Override
    public ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse getDefaultInstanceForType() {
      return ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.getDefaultInstance();
    }

    @java.lang.Override
    public ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse build() {
      ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse buildPartial() {
      ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse result = new ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse(this);
      result.productName_ = productName_;
      result.productQuantity_ = productQuantity_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse) {
        return mergeFrom((ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse other) {
      if (other == ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse.getDefaultInstance()) return this;
      if (!other.getProductName().isEmpty()) {
        productName_ = other.productName_;
        onChanged();
      }
      if (other.getProductQuantity() != 0D) {
        setProductQuantity(other.getProductQuantity());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object productName_ = "";
    /**
     * <code>string productName = 1;</code>
     * @return The productName.
     */
    public java.lang.String getProductName() {
      java.lang.Object ref = productName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productName = 1;</code>
     * @return The bytes for productName.
     */
    public com.google.protobuf.ByteString
        getProductNameBytes() {
      java.lang.Object ref = productName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productName = 1;</code>
     * @param value The productName to set.
     * @return This builder for chaining.
     */
    public Builder setProductName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductName() {
      
      productName_ = getDefaultInstance().getProductName();
      onChanged();
      return this;
    }
    /**
     * <code>string productName = 1;</code>
     * @param value The bytes for productName to set.
     * @return This builder for chaining.
     */
    public Builder setProductNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productName_ = value;
      onChanged();
      return this;
    }

    private double productQuantity_ ;
    /**
     * <code>double productQuantity = 2;</code>
     * @return The productQuantity.
     */
    @java.lang.Override
    public double getProductQuantity() {
      return productQuantity_;
    }
    /**
     * <code>double productQuantity = 2;</code>
     * @param value The productQuantity to set.
     * @return This builder for chaining.
     */
    public Builder setProductQuantity(double value) {
      
      productQuantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double productQuantity = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearProductQuantity() {
      
      productQuantity_ = 0D;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)
  }

  // @@protoc_insertion_point(class_scope:ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse)
  private static final ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse();
  }

  public static ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckOrderResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckOrderResponse>() {
    @java.lang.Override
    public CheckOrderResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckOrderResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckOrderResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckOrderResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ds.inventoryManagementSystem.grpc.generated.CheckOrderResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

