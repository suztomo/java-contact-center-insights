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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface EntityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.Entity)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The representative name for the entity.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The representative name for the entity.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The entity type.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Entity.Type type = 2;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The entity type.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.Entity.Type type = 2;</code>
   *
   * @return The type.
   */
  com.google.cloud.contactcenterinsights.v1.Entity.Type getType();

  /**
   *
   *
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  int getMetadataCount();
  /**
   *
   *
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  boolean containsMetadata(java.lang.String key);
  /** Use {@link #getMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMetadata();
  /**
   *
   *
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMetadataMap();
  /**
   *
   *
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Metadata associated with the entity.
   * For most entity types, the metadata is a Wikipedia URL (`wikipedia_url`)
   * and Knowledge Graph MID (`mid`), if they are available. For the metadata
   * associated with other entity types, see the Type table below.
   * </pre>
   *
   * <code>map&lt;string, string&gt; metadata = 3;</code>
   */
  java.lang.String getMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The salience score associated with the entity in the [0, 1.0] range.
   * The salience score for an entity provides information about the
   * importance or centrality of that entity to the entire document text.
   * Scores closer to 0 are less salient, while scores closer to 1.0 are highly
   * salient.
   * </pre>
   *
   * <code>float salience = 4;</code>
   *
   * @return The salience.
   */
  float getSalience();

  /**
   *
   *
   * <pre>
   * The aggregate sentiment expressed for this entity in the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 5;</code>
   *
   * @return Whether the sentiment field is set.
   */
  boolean hasSentiment();
  /**
   *
   *
   * <pre>
   * The aggregate sentiment expressed for this entity in the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 5;</code>
   *
   * @return The sentiment.
   */
  com.google.cloud.contactcenterinsights.v1.SentimentData getSentiment();
  /**
   *
   *
   * <pre>
   * The aggregate sentiment expressed for this entity in the conversation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment = 5;</code>
   */
  com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentOrBuilder();
}
