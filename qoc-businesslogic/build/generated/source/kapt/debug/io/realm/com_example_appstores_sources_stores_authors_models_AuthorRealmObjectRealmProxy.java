package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy extends com.example.appstores.sources.stores.authors.models.AuthorRealmObject
    implements RealmObjectProxy, com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface {

    static final class AuthorRealmObjectColumnInfo extends ColumnInfo {
        long linkIndex;
        long nameIndex;

        AuthorRealmObjectColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AuthorRealmObject");
            this.linkIndex = addColumnDetails("link", "link", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
        }

        AuthorRealmObjectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AuthorRealmObjectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AuthorRealmObjectColumnInfo src = (AuthorRealmObjectColumnInfo) rawSrc;
            final AuthorRealmObjectColumnInfo dst = (AuthorRealmObjectColumnInfo) rawDst;
            dst.linkIndex = src.linkIndex;
            dst.nameIndex = src.nameIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AuthorRealmObjectColumnInfo columnInfo;
    private ProxyState<com.example.appstores.sources.stores.authors.models.AuthorRealmObject> proxyState;

    com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AuthorRealmObjectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.appstores.sources.stores.authors.models.AuthorRealmObject>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$link() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.linkIndex);
    }

    @Override
    public void realmSet$link(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'link' to null.");
            }
            row.getTable().setString(columnInfo.linkIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'link' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.linkIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'name' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AuthorRealmObject", 2, 0);
        builder.addPersistedProperty("link", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AuthorRealmObjectColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AuthorRealmObjectColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AuthorRealmObject";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AuthorRealmObject";
    }

    @SuppressWarnings("cast")
    public static com.example.appstores.sources.stores.authors.models.AuthorRealmObject createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject obj = realm.createObjectInternal(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class, true, excludeFields);

        final com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) obj;
        if (json.has("link")) {
            if (json.isNull("link")) {
                objProxy.realmSet$link(null);
            } else {
                objProxy.realmSet$link((String) json.getString("link"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.appstores.sources.stores.authors.models.AuthorRealmObject createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.example.appstores.sources.stores.authors.models.AuthorRealmObject obj = new com.example.appstores.sources.stores.authors.models.AuthorRealmObject();
        final com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("link")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$link((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$link(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.example.appstores.sources.stores.authors.models.AuthorRealmObject copyOrUpdate(Realm realm, com.example.appstores.sources.stores.authors.models.AuthorRealmObject object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.example.appstores.sources.stores.authors.models.AuthorRealmObject copy(Realm realm, com.example.appstores.sources.stores.authors.models.AuthorRealmObject newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject realmObject = realm.createObjectInternal(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface realmObjectSource = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) newObject;
        com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface realmObjectCopy = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$link(realmObjectSource.realmGet$link());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.appstores.sources.stores.authors.models.AuthorRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        AuthorRealmObjectColumnInfo columnInfo = (AuthorRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$link = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        }
        String realmGet$name = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        AuthorRealmObjectColumnInfo columnInfo = (AuthorRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$link = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            }
            String realmGet$name = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.appstores.sources.stores.authors.models.AuthorRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        AuthorRealmObjectColumnInfo columnInfo = (AuthorRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$link = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
        }
        String realmGet$name = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        AuthorRealmObjectColumnInfo columnInfo = (AuthorRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class);
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$link = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
            }
            String realmGet$name = ((com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
        }
    }

    public static com.example.appstores.sources.stores.authors.models.AuthorRealmObject createDetachedCopy(com.example.appstores.sources.stores.authors.models.AuthorRealmObject realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.appstores.sources.stores.authors.models.AuthorRealmObject();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cachedObject.object;
            }
            unmanagedObject = (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface unmanagedCopy = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) unmanagedObject;
        com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface realmSource = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$link(realmSource.realmGet$link());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AuthorRealmObject = proxy[");
        stringBuilder.append("{link:");
        stringBuilder.append(realmGet$link());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy aAuthorRealmObject = (com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAuthorRealmObject.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAuthorRealmObject.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAuthorRealmObject.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
