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
public class com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy extends com.example.appstores.sources.stores.categories.models.CategoryRealmObject
    implements RealmObjectProxy, com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface {

    static final class CategoryRealmObjectColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long linkIndex;

        CategoryRealmObjectColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("CategoryRealmObject");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.linkIndex = addColumnDetails("link", "link", objectSchemaInfo);
        }

        CategoryRealmObjectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new CategoryRealmObjectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final CategoryRealmObjectColumnInfo src = (CategoryRealmObjectColumnInfo) rawSrc;
            final CategoryRealmObjectColumnInfo dst = (CategoryRealmObjectColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.linkIndex = src.linkIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private CategoryRealmObjectColumnInfo columnInfo;
    private ProxyState<com.example.appstores.sources.stores.categories.models.CategoryRealmObject> proxyState;

    com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (CategoryRealmObjectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.appstores.sources.stores.categories.models.CategoryRealmObject>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'id' cannot be changed after object was created.");
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("CategoryRealmObject", 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("link", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static CategoryRealmObjectColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new CategoryRealmObjectColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "CategoryRealmObject";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "CategoryRealmObject";
    }

    @SuppressWarnings("cast")
    public static com.example.appstores.sources.stores.categories.models.CategoryRealmObject createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject obj = null;
        if (update) {
            Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
            CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy) realm.createObjectInternal(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy) realm.createObjectInternal(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("link")) {
            if (json.isNull("link")) {
                objProxy.realmSet$link(null);
            } else {
                objProxy.realmSet$link((String) json.getString("link"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.appstores.sources.stores.categories.models.CategoryRealmObject createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.appstores.sources.stores.categories.models.CategoryRealmObject obj = new com.example.appstores.sources.stores.categories.models.CategoryRealmObject();
        final com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("link")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$link((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$link(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
        }
        return realm.copyToRealm(obj);
    }

    public static com.example.appstores.sources.stores.categories.models.CategoryRealmObject copyOrUpdate(Realm realm, com.example.appstores.sources.stores.categories.models.CategoryRealmObject object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cachedRealmObject;
        }

        com.example.appstores.sources.stores.categories.models.CategoryRealmObject realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
            CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.example.appstores.sources.stores.categories.models.CategoryRealmObject copy(Realm realm, com.example.appstores.sources.stores.categories.models.CategoryRealmObject newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject realmObject = realm.createObjectInternal(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface realmObjectSource = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) newObject;
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface realmObjectCopy = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$link(realmObjectSource.realmGet$link());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.appstores.sources.stores.categories.models.CategoryRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$link = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$link = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.appstores.sources.stores.categories.models.CategoryRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$link = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        CategoryRealmObjectColumnInfo columnInfo = (CategoryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$link = ((com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
            }
        }
    }

    public static com.example.appstores.sources.stores.categories.models.CategoryRealmObject createDetachedCopy(com.example.appstores.sources.stores.categories.models.CategoryRealmObject realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.appstores.sources.stores.categories.models.CategoryRealmObject();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cachedObject.object;
            }
            unmanagedObject = (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface unmanagedCopy = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) unmanagedObject;
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface realmSource = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$link(realmSource.realmGet$link());

        return unmanagedObject;
    }

    static com.example.appstores.sources.stores.categories.models.CategoryRealmObject update(Realm realm, com.example.appstores.sources.stores.categories.models.CategoryRealmObject realmObject, com.example.appstores.sources.stores.categories.models.CategoryRealmObject newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface realmObjectTarget = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) realmObject;
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface realmObjectSource = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectTarget.realmSet$link(realmObjectSource.realmGet$link());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("CategoryRealmObject = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{link:");
        stringBuilder.append(realmGet$link());
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
        com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy aCategoryRealmObject = (com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aCategoryRealmObject.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aCategoryRealmObject.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aCategoryRealmObject.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
