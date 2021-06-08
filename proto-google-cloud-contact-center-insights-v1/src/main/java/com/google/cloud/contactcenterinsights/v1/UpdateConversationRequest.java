/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * The request to update a conversation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateConversationRequest}
 */
public final class UpdateConversationRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
    UpdateConversationRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateConversationRequest.newBuilder() to construct.
  private UpdateConversationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateConversationRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateConversationRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateConversationRequest(
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
          case 10:
            {
              com.google.cloud.contactcenterinsights.v1.Conversation.Builder subBuilder = null;
              if (conversation_ != null) {
                subBuilder = conversation_.toBuilder();
              }
              conversation_ =
                  input.readMessage(
                      com.google.cloud.contactcenterinsights.v1.Conversation.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(conversation_);
                conversation_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateConversationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_UpdateConversationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.class,
            com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.Builder.class);
  }

  public static final int CONVERSATION_FIELD_NUMBER = 1;
  private com.google.cloud.contactcenterinsights.v1.Conversation conversation_;
  /**
   *
   *
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the conversation field is set.
   */
  @java.lang.Override
  public boolean hasConversation() {
    return conversation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The conversation.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.Conversation getConversation() {
    return conversation_ == null
        ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
        : conversation_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new values for the conversation.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder
      getConversationOrBuilder() {
    return getConversation();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (conversation_ != null) {
      output.writeMessage(1, getConversation());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (conversation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getConversation());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest other =
        (com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest) obj;

    if (hasConversation() != other.hasConversation()) return false;
    if (hasConversation()) {
      if (!getConversation().equals(other.getConversation())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
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
    if (hasConversation()) {
      hash = (37 * hash) + CONVERSATION_FIELD_NUMBER;
      hash = (53 * hash) + getConversation().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request to update a conversation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.UpdateConversationRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
      com.google.cloud.contactcenterinsights.v1.UpdateConversationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateConversationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.class,
              com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (conversationBuilder_ == null) {
        conversation_ = null;
      } else {
        conversation_ = null;
        conversationBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_UpdateConversationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest build() {
      com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest buildPartial() {
      com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest result =
          new com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest(this);
      if (conversationBuilder_ == null) {
        result.conversation_ = conversation_;
      } else {
        result.conversation_ = conversationBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest) {
        return mergeFrom(
            (com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
              .getDefaultInstance()) return this;
      if (other.hasConversation()) {
        mergeConversation(other.getConversation());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.Conversation conversation_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Conversation,
            com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
            com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>
        conversationBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the conversation field is set.
     */
    public boolean hasConversation() {
      return conversationBuilder_ != null || conversation_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The conversation.
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation getConversation() {
      if (conversationBuilder_ == null) {
        return conversation_ == null
            ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
            : conversation_;
      } else {
        return conversationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversation(com.google.cloud.contactcenterinsights.v1.Conversation value) {
      if (conversationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversation_ = value;
        onChanged();
      } else {
        conversationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setConversation(
        com.google.cloud.contactcenterinsights.v1.Conversation.Builder builderForValue) {
      if (conversationBuilder_ == null) {
        conversation_ = builderForValue.build();
        onChanged();
      } else {
        conversationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeConversation(com.google.cloud.contactcenterinsights.v1.Conversation value) {
      if (conversationBuilder_ == null) {
        if (conversation_ != null) {
          conversation_ =
              com.google.cloud.contactcenterinsights.v1.Conversation.newBuilder(conversation_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          conversation_ = value;
        }
        onChanged();
      } else {
        conversationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearConversation() {
      if (conversationBuilder_ == null) {
        conversation_ = null;
        onChanged();
      } else {
        conversation_ = null;
        conversationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.Conversation.Builder getConversationBuilder() {

      onChanged();
      return getConversationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder
        getConversationOrBuilder() {
      if (conversationBuilder_ != null) {
        return conversationBuilder_.getMessageOrBuilder();
      } else {
        return conversation_ == null
            ? com.google.cloud.contactcenterinsights.v1.Conversation.getDefaultInstance()
            : conversation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new values for the conversation.
     * </pre>
     *
     * <code>
     * .google.cloud.contactcenterinsights.v1.Conversation conversation = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.Conversation,
            com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
            com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>
        getConversationFieldBuilder() {
      if (conversationBuilder_ == null) {
        conversationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.Conversation,
                com.google.cloud.contactcenterinsights.v1.Conversation.Builder,
                com.google.cloud.contactcenterinsights.v1.ConversationOrBuilder>(
                getConversation(), getParentForChildren(), isClean());
        conversation_ = null;
      }
      return conversationBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * The list of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.UpdateConversationRequest)
  private static final com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest();
  }

  public static com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateConversationRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateConversationRequest>() {
        @java.lang.Override
        public UpdateConversationRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateConversationRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateConversationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateConversationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.UpdateConversationRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
