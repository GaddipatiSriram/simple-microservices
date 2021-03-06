// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app1/books.proto

package com.proto.books;

/**
 * Protobuf type {@code books.OrderDetails}
 */
public  final class OrderDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:books.OrderDetails)
    OrderDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderDetails.newBuilder() to construct.
  private OrderDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderDetails() {
    price_ = "";
    confirmationNumber_ = "";
    estDeliveryDate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderDetails(
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

            price_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            confirmationNumber_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            estDeliveryDate_ = s;
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
    return com.proto.books.Books.internal_static_books_OrderDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.books.Books.internal_static_books_OrderDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.books.OrderDetails.class, com.proto.books.OrderDetails.Builder.class);
  }

  public static final int PRICE_FIELD_NUMBER = 1;
  private volatile java.lang.Object price_;
  /**
   * <code>string price = 1;</code>
   * @return The price.
   */
  public java.lang.String getPrice() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      price_ = s;
      return s;
    }
  }
  /**
   * <code>string price = 1;</code>
   * @return The bytes for price.
   */
  public com.google.protobuf.ByteString
      getPriceBytes() {
    java.lang.Object ref = price_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      price_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIRMATION_NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object confirmationNumber_;
  /**
   * <code>string confirmation_number = 2;</code>
   * @return The confirmationNumber.
   */
  public java.lang.String getConfirmationNumber() {
    java.lang.Object ref = confirmationNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confirmationNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string confirmation_number = 2;</code>
   * @return The bytes for confirmationNumber.
   */
  public com.google.protobuf.ByteString
      getConfirmationNumberBytes() {
    java.lang.Object ref = confirmationNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confirmationNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EST_DELIVERY_DATE_FIELD_NUMBER = 3;
  private volatile java.lang.Object estDeliveryDate_;
  /**
   * <code>string est_delivery_date = 3;</code>
   * @return The estDeliveryDate.
   */
  public java.lang.String getEstDeliveryDate() {
    java.lang.Object ref = estDeliveryDate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      estDeliveryDate_ = s;
      return s;
    }
  }
  /**
   * <code>string est_delivery_date = 3;</code>
   * @return The bytes for estDeliveryDate.
   */
  public com.google.protobuf.ByteString
      getEstDeliveryDateBytes() {
    java.lang.Object ref = estDeliveryDate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      estDeliveryDate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getPriceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, price_);
    }
    if (!getConfirmationNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, confirmationNumber_);
    }
    if (!getEstDeliveryDateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, estDeliveryDate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPriceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, price_);
    }
    if (!getConfirmationNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, confirmationNumber_);
    }
    if (!getEstDeliveryDateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, estDeliveryDate_);
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
    if (!(obj instanceof com.proto.books.OrderDetails)) {
      return super.equals(obj);
    }
    com.proto.books.OrderDetails other = (com.proto.books.OrderDetails) obj;

    if (!getPrice()
        .equals(other.getPrice())) return false;
    if (!getConfirmationNumber()
        .equals(other.getConfirmationNumber())) return false;
    if (!getEstDeliveryDate()
        .equals(other.getEstDeliveryDate())) return false;
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
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + getPrice().hashCode();
    hash = (37 * hash) + CONFIRMATION_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getConfirmationNumber().hashCode();
    hash = (37 * hash) + EST_DELIVERY_DATE_FIELD_NUMBER;
    hash = (53 * hash) + getEstDeliveryDate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.books.OrderDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.books.OrderDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.books.OrderDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.books.OrderDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.books.OrderDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.books.OrderDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.books.OrderDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.books.OrderDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.books.OrderDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.books.OrderDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.books.OrderDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.books.OrderDetails parseFrom(
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
  public static Builder newBuilder(com.proto.books.OrderDetails prototype) {
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
   * Protobuf type {@code books.OrderDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:books.OrderDetails)
      com.proto.books.OrderDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.books.Books.internal_static_books_OrderDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.books.Books.internal_static_books_OrderDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.books.OrderDetails.class, com.proto.books.OrderDetails.Builder.class);
    }

    // Construct using com.proto.books.OrderDetails.newBuilder()
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
      price_ = "";

      confirmationNumber_ = "";

      estDeliveryDate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.books.Books.internal_static_books_OrderDetails_descriptor;
    }

    @java.lang.Override
    public com.proto.books.OrderDetails getDefaultInstanceForType() {
      return com.proto.books.OrderDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.books.OrderDetails build() {
      com.proto.books.OrderDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.books.OrderDetails buildPartial() {
      com.proto.books.OrderDetails result = new com.proto.books.OrderDetails(this);
      result.price_ = price_;
      result.confirmationNumber_ = confirmationNumber_;
      result.estDeliveryDate_ = estDeliveryDate_;
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
      if (other instanceof com.proto.books.OrderDetails) {
        return mergeFrom((com.proto.books.OrderDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.books.OrderDetails other) {
      if (other == com.proto.books.OrderDetails.getDefaultInstance()) return this;
      if (!other.getPrice().isEmpty()) {
        price_ = other.price_;
        onChanged();
      }
      if (!other.getConfirmationNumber().isEmpty()) {
        confirmationNumber_ = other.confirmationNumber_;
        onChanged();
      }
      if (!other.getEstDeliveryDate().isEmpty()) {
        estDeliveryDate_ = other.estDeliveryDate_;
        onChanged();
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
      com.proto.books.OrderDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.proto.books.OrderDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object price_ = "";
    /**
     * <code>string price = 1;</code>
     * @return The price.
     */
    public java.lang.String getPrice() {
      java.lang.Object ref = price_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        price_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string price = 1;</code>
     * @return The bytes for price.
     */
    public com.google.protobuf.ByteString
        getPriceBytes() {
      java.lang.Object ref = price_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        price_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string price = 1;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string price = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = getDefaultInstance().getPrice();
      onChanged();
      return this;
    }
    /**
     * <code>string price = 1;</code>
     * @param value The bytes for price to set.
     * @return This builder for chaining.
     */
    public Builder setPriceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      price_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object confirmationNumber_ = "";
    /**
     * <code>string confirmation_number = 2;</code>
     * @return The confirmationNumber.
     */
    public java.lang.String getConfirmationNumber() {
      java.lang.Object ref = confirmationNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confirmationNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string confirmation_number = 2;</code>
     * @return The bytes for confirmationNumber.
     */
    public com.google.protobuf.ByteString
        getConfirmationNumberBytes() {
      java.lang.Object ref = confirmationNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confirmationNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string confirmation_number = 2;</code>
     * @param value The confirmationNumber to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confirmationNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation_number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfirmationNumber() {
      
      confirmationNumber_ = getDefaultInstance().getConfirmationNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string confirmation_number = 2;</code>
     * @param value The bytes for confirmationNumber to set.
     * @return This builder for chaining.
     */
    public Builder setConfirmationNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confirmationNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object estDeliveryDate_ = "";
    /**
     * <code>string est_delivery_date = 3;</code>
     * @return The estDeliveryDate.
     */
    public java.lang.String getEstDeliveryDate() {
      java.lang.Object ref = estDeliveryDate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        estDeliveryDate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string est_delivery_date = 3;</code>
     * @return The bytes for estDeliveryDate.
     */
    public com.google.protobuf.ByteString
        getEstDeliveryDateBytes() {
      java.lang.Object ref = estDeliveryDate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        estDeliveryDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string est_delivery_date = 3;</code>
     * @param value The estDeliveryDate to set.
     * @return This builder for chaining.
     */
    public Builder setEstDeliveryDate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      estDeliveryDate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string est_delivery_date = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEstDeliveryDate() {
      
      estDeliveryDate_ = getDefaultInstance().getEstDeliveryDate();
      onChanged();
      return this;
    }
    /**
     * <code>string est_delivery_date = 3;</code>
     * @param value The bytes for estDeliveryDate to set.
     * @return This builder for chaining.
     */
    public Builder setEstDeliveryDateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      estDeliveryDate_ = value;
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


    // @@protoc_insertion_point(builder_scope:books.OrderDetails)
  }

  // @@protoc_insertion_point(class_scope:books.OrderDetails)
  private static final com.proto.books.OrderDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.books.OrderDetails();
  }

  public static com.proto.books.OrderDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderDetails>
      PARSER = new com.google.protobuf.AbstractParser<OrderDetails>() {
    @java.lang.Override
    public OrderDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.books.OrderDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

