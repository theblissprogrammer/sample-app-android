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
public class com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy extends com.example.appstores.sources.stores.entries.models.EntryRealmObject
    implements RealmObjectProxy, com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface {

    static final class EntryRealmObjectColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long thumbnailsRawIndex;
        long summaryIndex;
        long priceIndex;
        long currencyIndex;
        long contentTypeIndex;
        long copyrightIndex;
        long titleIndex;
        long linkIndex;
        long authorRawIndex;
        long categoryRawIndex;
        long releaseDateIndex;

        EntryRealmObjectColumnInfo(OsSchemaInfo schemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("EntryRealmObject");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.thumbnailsRawIndex = addColumnDetails("thumbnailsRaw", "thumbnailsRaw", objectSchemaInfo);
            this.summaryIndex = addColumnDetails("summary", "summary", objectSchemaInfo);
            this.priceIndex = addColumnDetails("price", "price", objectSchemaInfo);
            this.currencyIndex = addColumnDetails("currency", "currency", objectSchemaInfo);
            this.contentTypeIndex = addColumnDetails("contentType", "contentType", objectSchemaInfo);
            this.copyrightIndex = addColumnDetails("copyright", "copyright", objectSchemaInfo);
            this.titleIndex = addColumnDetails("title", "title", objectSchemaInfo);
            this.linkIndex = addColumnDetails("link", "link", objectSchemaInfo);
            this.authorRawIndex = addColumnDetails("authorRaw", "authorRaw", objectSchemaInfo);
            this.categoryRawIndex = addColumnDetails("categoryRaw", "categoryRaw", objectSchemaInfo);
            this.releaseDateIndex = addColumnDetails("releaseDate", "releaseDate", objectSchemaInfo);
        }

        EntryRealmObjectColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EntryRealmObjectColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EntryRealmObjectColumnInfo src = (EntryRealmObjectColumnInfo) rawSrc;
            final EntryRealmObjectColumnInfo dst = (EntryRealmObjectColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.thumbnailsRawIndex = src.thumbnailsRawIndex;
            dst.summaryIndex = src.summaryIndex;
            dst.priceIndex = src.priceIndex;
            dst.currencyIndex = src.currencyIndex;
            dst.contentTypeIndex = src.contentTypeIndex;
            dst.copyrightIndex = src.copyrightIndex;
            dst.titleIndex = src.titleIndex;
            dst.linkIndex = src.linkIndex;
            dst.authorRawIndex = src.authorRawIndex;
            dst.categoryRawIndex = src.categoryRawIndex;
            dst.releaseDateIndex = src.releaseDateIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private EntryRealmObjectColumnInfo columnInfo;
    private ProxyState<com.example.appstores.sources.stores.entries.models.EntryRealmObject> proxyState;
    private RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawRealmList;

    com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EntryRealmObjectColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.example.appstores.sources.stores.entries.models.EntryRealmObject>(this);
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
    public RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> realmGet$thumbnailsRaw() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (thumbnailsRawRealmList != null) {
            return thumbnailsRawRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.thumbnailsRawIndex);
            thumbnailsRawRealmList = new RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject>(com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject.class, osList, proxyState.getRealm$realm());
            return thumbnailsRawRealmList;
        }
    }

    @Override
    public void realmSet$thumbnailsRaw(RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("thumbnailsRaw")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> original = value;
                value = new RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject>();
                for (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.thumbnailsRawIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$summary() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.summaryIndex);
    }

    @Override
    public void realmSet$summary(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
            }
            row.getTable().setString(columnInfo.summaryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'summary' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.summaryIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$price() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.priceIndex);
    }

    @Override
    public void realmSet$price(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.priceIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.priceIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$currency() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.currencyIndex);
    }

    @Override
    public void realmSet$currency(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'currency' to null.");
            }
            row.getTable().setString(columnInfo.currencyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'currency' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.currencyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentTypeIndex);
    }

    @Override
    public void realmSet$contentType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'contentType' to null.");
            }
            row.getTable().setString(columnInfo.contentTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'contentType' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.contentTypeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$copyright() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.copyrightIndex);
    }

    @Override
    public void realmSet$copyright(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'copyright' to null.");
            }
            row.getTable().setString(columnInfo.copyrightIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'copyright' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.copyrightIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$title() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.titleIndex);
    }

    @Override
    public void realmSet$title(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
            }
            row.getTable().setString(columnInfo.titleIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'title' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.titleIndex, value);
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
    public com.example.appstores.sources.stores.authors.models.AuthorRealmObject realmGet$authorRaw() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.authorRawIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.appstores.sources.stores.authors.models.AuthorRealmObject.class, proxyState.getRow$realm().getLink(columnInfo.authorRawIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$authorRaw(com.example.appstores.sources.stores.authors.models.AuthorRealmObject value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("authorRaw")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.authorRawIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.authorRawIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.authorRawIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.authorRawIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public com.example.appstores.sources.stores.categories.models.CategoryRealmObject realmGet$categoryRaw() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.categoryRawIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.example.appstores.sources.stores.categories.models.CategoryRealmObject.class, proxyState.getRow$realm().getLink(columnInfo.categoryRawIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$categoryRaw(com.example.appstores.sources.stores.categories.models.CategoryRealmObject value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("categoryRaw")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.categoryRawIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.categoryRawIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.categoryRawIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.categoryRawIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$releaseDate() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.releaseDateIndex);
    }

    @Override
    public void realmSet$releaseDate(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'releaseDate' to null.");
            }
            row.getTable().setDate(columnInfo.releaseDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'releaseDate' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.releaseDateIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("EntryRealmObject", 13, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, Property.PRIMARY_KEY, Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("thumbnailsRaw", RealmFieldType.LIST, "ThumbnailRealmObject");
        builder.addPersistedProperty("summary", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("price", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("currency", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("contentType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("copyright", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("title", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("link", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("authorRaw", RealmFieldType.OBJECT, "AuthorRealmObject");
        builder.addPersistedLinkProperty("categoryRaw", RealmFieldType.OBJECT, "CategoryRealmObject");
        builder.addPersistedProperty("releaseDate", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EntryRealmObjectColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new EntryRealmObjectColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "EntryRealmObject";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EntryRealmObject";
    }

    @SuppressWarnings("cast")
    public static com.example.appstores.sources.stores.entries.models.EntryRealmObject createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        com.example.appstores.sources.stores.entries.models.EntryRealmObject obj = null;
        if (update) {
            Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
            EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = Table.NO_MATCH;
            if (!json.isNull("id")) {
                rowIndex = table.findFirstLong(pkColumnIndex, json.getLong("id"));
            }
            if (rowIndex != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("thumbnailsRaw")) {
                excludeFields.add("thumbnailsRaw");
            }
            if (json.has("authorRaw")) {
                excludeFields.add("authorRaw");
            }
            if (json.has("categoryRaw")) {
                excludeFields.add("categoryRaw");
            }
            if (json.has("id")) {
                if (json.isNull("id")) {
                    obj = (io.realm.com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy) realm.createObjectInternal(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy) realm.createObjectInternal(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class, json.getInt("id"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
            }
        }

        final com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("thumbnailsRaw")) {
            if (json.isNull("thumbnailsRaw")) {
                objProxy.realmSet$thumbnailsRaw(null);
            } else {
                objProxy.realmGet$thumbnailsRaw().clear();
                JSONArray array = json.getJSONArray("thumbnailsRaw");
                for (int i = 0; i < array.length(); i++) {
                    com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject item = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$thumbnailsRaw().add(item);
                }
            }
        }
        if (json.has("summary")) {
            if (json.isNull("summary")) {
                objProxy.realmSet$summary(null);
            } else {
                objProxy.realmSet$summary((String) json.getString("summary"));
            }
        }
        if (json.has("price")) {
            if (json.isNull("price")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
            } else {
                objProxy.realmSet$price((double) json.getDouble("price"));
            }
        }
        if (json.has("currency")) {
            if (json.isNull("currency")) {
                objProxy.realmSet$currency(null);
            } else {
                objProxy.realmSet$currency((String) json.getString("currency"));
            }
        }
        if (json.has("contentType")) {
            if (json.isNull("contentType")) {
                objProxy.realmSet$contentType(null);
            } else {
                objProxy.realmSet$contentType((String) json.getString("contentType"));
            }
        }
        if (json.has("copyright")) {
            if (json.isNull("copyright")) {
                objProxy.realmSet$copyright(null);
            } else {
                objProxy.realmSet$copyright((String) json.getString("copyright"));
            }
        }
        if (json.has("title")) {
            if (json.isNull("title")) {
                objProxy.realmSet$title(null);
            } else {
                objProxy.realmSet$title((String) json.getString("title"));
            }
        }
        if (json.has("link")) {
            if (json.isNull("link")) {
                objProxy.realmSet$link(null);
            } else {
                objProxy.realmSet$link((String) json.getString("link"));
            }
        }
        if (json.has("authorRaw")) {
            if (json.isNull("authorRaw")) {
                objProxy.realmSet$authorRaw(null);
            } else {
                com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("authorRaw"), update);
                objProxy.realmSet$authorRaw(authorRawObj);
            }
        }
        if (json.has("categoryRaw")) {
            if (json.isNull("categoryRaw")) {
                objProxy.realmSet$categoryRaw(null);
            } else {
                com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("categoryRaw"), update);
                objProxy.realmSet$categoryRaw(categoryRawObj);
            }
        }
        if (json.has("releaseDate")) {
            if (json.isNull("releaseDate")) {
                objProxy.realmSet$releaseDate(null);
            } else {
                Object timestamp = json.get("releaseDate");
                if (timestamp instanceof String) {
                    objProxy.realmSet$releaseDate(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$releaseDate(new Date(json.getLong("releaseDate")));
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.example.appstores.sources.stores.entries.models.EntryRealmObject createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.example.appstores.sources.stores.entries.models.EntryRealmObject obj = new com.example.appstores.sources.stores.entries.models.EntryRealmObject();
        final com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface objProxy = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) obj;
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
            } else if (name.equals("thumbnailsRaw")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$thumbnailsRaw(null);
                } else {
                    objProxy.realmSet$thumbnailsRaw(new RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject item = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$thumbnailsRaw().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("summary")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$summary((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$summary(null);
                }
            } else if (name.equals("price")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$price((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'price' to null.");
                }
            } else if (name.equals("currency")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$currency((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$currency(null);
                }
            } else if (name.equals("contentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contentType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contentType(null);
                }
            } else if (name.equals("copyright")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$copyright((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$copyright(null);
                }
            } else if (name.equals("title")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$title((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$title(null);
                }
            } else if (name.equals("link")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$link((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$link(null);
                }
            } else if (name.equals("authorRaw")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$authorRaw(null);
                } else {
                    com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$authorRaw(authorRawObj);
                }
            } else if (name.equals("categoryRaw")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$categoryRaw(null);
                } else {
                    com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$categoryRaw(categoryRawObj);
                }
            } else if (name.equals("releaseDate")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$releaseDate(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$releaseDate(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$releaseDate(JsonUtils.stringToDate(reader.nextString()));
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

    public static com.example.appstores.sources.stores.entries.models.EntryRealmObject copyOrUpdate(Realm realm, com.example.appstores.sources.stores.entries.models.EntryRealmObject object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.example.appstores.sources.stores.entries.models.EntryRealmObject) cachedRealmObject;
        }

        com.example.appstores.sources.stores.entries.models.EntryRealmObject realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
            EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
            long pkColumnIndex = columnInfo.idIndex;
            long rowIndex = table.findFirstLong(pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
            if (rowIndex == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(rowIndex), realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class), false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, realmObject, object, cache) : copy(realm, object, update, cache);
    }

    public static com.example.appstores.sources.stores.entries.models.EntryRealmObject copy(Realm realm, com.example.appstores.sources.stores.entries.models.EntryRealmObject newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.example.appstores.sources.stores.entries.models.EntryRealmObject) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.example.appstores.sources.stores.entries.models.EntryRealmObject realmObject = realm.createObjectInternal(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) newObject).realmGet$id(), false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface realmObjectSource = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) newObject;
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface realmObjectCopy = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());

        RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = realmObjectSource.realmGet$thumbnailsRaw();
        if (thumbnailsRawList != null) {
            RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawRealmList = realmObjectCopy.realmGet$thumbnailsRaw();
            thumbnailsRawRealmList.clear();
            for (int i = 0; i < thumbnailsRawList.size(); i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem = thumbnailsRawList.get(i);
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject cachethumbnailsRaw = (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject) cache.get(thumbnailsRawItem);
                if (cachethumbnailsRaw != null) {
                    thumbnailsRawRealmList.add(cachethumbnailsRaw);
                } else {
                    thumbnailsRawRealmList.add(com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.copyOrUpdate(realm, thumbnailsRawItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$summary(realmObjectSource.realmGet$summary());
        realmObjectCopy.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectCopy.realmSet$currency(realmObjectSource.realmGet$currency());
        realmObjectCopy.realmSet$contentType(realmObjectSource.realmGet$contentType());
        realmObjectCopy.realmSet$copyright(realmObjectSource.realmGet$copyright());
        realmObjectCopy.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectCopy.realmSet$link(realmObjectSource.realmGet$link());

        com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = realmObjectSource.realmGet$authorRaw();
        if (authorRawObj == null) {
            realmObjectCopy.realmSet$authorRaw(null);
        } else {
            com.example.appstores.sources.stores.authors.models.AuthorRealmObject cacheauthorRaw = (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cache.get(authorRawObj);
            if (cacheauthorRaw != null) {
                realmObjectCopy.realmSet$authorRaw(cacheauthorRaw);
            } else {
                realmObjectCopy.realmSet$authorRaw(com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.copyOrUpdate(realm, authorRawObj, update, cache));
            }
        }

        com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = realmObjectSource.realmGet$categoryRaw();
        if (categoryRawObj == null) {
            realmObjectCopy.realmSet$categoryRaw(null);
        } else {
            com.example.appstores.sources.stores.categories.models.CategoryRealmObject cachecategoryRaw = (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cache.get(categoryRawObj);
            if (cachecategoryRaw != null) {
                realmObjectCopy.realmSet$categoryRaw(cachecategoryRaw);
            } else {
                realmObjectCopy.realmSet$categoryRaw(com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.copyOrUpdate(realm, categoryRawObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$releaseDate(realmObjectSource.realmGet$releaseDate());
        return realmObject;
    }

    public static long insert(Realm realm, com.example.appstores.sources.stores.entries.models.EntryRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }

        RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$thumbnailsRaw();
        if (thumbnailsRawList != null) {
            OsList thumbnailsRawOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.thumbnailsRawIndex);
            for (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem : thumbnailsRawList) {
                Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                if (cacheItemIndexthumbnailsRaw == null) {
                    cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insert(realm, thumbnailsRawItem, cache);
                }
                thumbnailsRawOsList.addRow(cacheItemIndexthumbnailsRaw);
            }
        }
        String realmGet$summary = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryIndex, rowIndex, realmGet$summary, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.priceIndex, rowIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$price(), false);
        String realmGet$currency = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$currency();
        if (realmGet$currency != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currencyIndex, rowIndex, realmGet$currency, false);
        }
        String realmGet$contentType = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, realmGet$contentType, false);
        }
        String realmGet$copyright = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$copyright();
        if (realmGet$copyright != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.copyrightIndex, rowIndex, realmGet$copyright, false);
        }
        String realmGet$title = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        }
        String realmGet$link = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        }

        com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$authorRaw();
        if (authorRawObj != null) {
            Long cacheauthorRaw = cache.get(authorRawObj);
            if (cacheauthorRaw == null) {
                cacheauthorRaw = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.insert(realm, authorRawObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.authorRawIndex, rowIndex, cacheauthorRaw, false);
        }

        com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$categoryRaw();
        if (categoryRawObj != null) {
            Long cachecategoryRaw = cache.get(categoryRawObj);
            if (cachecategoryRaw == null) {
                cachecategoryRaw = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.insert(realm, categoryRawObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.categoryRawIndex, rowIndex, cachecategoryRaw, false);
        }
        java.util.Date realmGet$releaseDate = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
        if (realmGet$releaseDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate.getTime(), false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.appstores.sources.stores.entries.models.EntryRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.entries.models.EntryRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }

            RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$thumbnailsRaw();
            if (thumbnailsRawList != null) {
                OsList thumbnailsRawOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.thumbnailsRawIndex);
                for (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem : thumbnailsRawList) {
                    Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                    if (cacheItemIndexthumbnailsRaw == null) {
                        cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insert(realm, thumbnailsRawItem, cache);
                    }
                    thumbnailsRawOsList.addRow(cacheItemIndexthumbnailsRaw);
                }
            }
            String realmGet$summary = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryIndex, rowIndex, realmGet$summary, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.priceIndex, rowIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$price(), false);
            String realmGet$currency = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$currency();
            if (realmGet$currency != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currencyIndex, rowIndex, realmGet$currency, false);
            }
            String realmGet$contentType = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$contentType();
            if (realmGet$contentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, realmGet$contentType, false);
            }
            String realmGet$copyright = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$copyright();
            if (realmGet$copyright != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.copyrightIndex, rowIndex, realmGet$copyright, false);
            }
            String realmGet$title = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            }
            String realmGet$link = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            }

            com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$authorRaw();
            if (authorRawObj != null) {
                Long cacheauthorRaw = cache.get(authorRawObj);
                if (cacheauthorRaw == null) {
                    cacheauthorRaw = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.insert(realm, authorRawObj, cache);
                }
                table.setLink(columnInfo.authorRawIndex, rowIndex, cacheauthorRaw, false);
            }

            com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$categoryRaw();
            if (categoryRawObj != null) {
                Long cachecategoryRaw = cache.get(categoryRawObj);
                if (cachecategoryRaw == null) {
                    cachecategoryRaw = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.insert(realm, categoryRawObj, cache);
                }
                table.setLink(columnInfo.categoryRawIndex, rowIndex, cachecategoryRaw, false);
            }
            java.util.Date realmGet$releaseDate = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
            if (realmGet$releaseDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate.getTime(), false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.example.appstores.sources.stores.entries.models.EntryRealmObject object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        long rowIndex = Table.NO_MATCH;
        Object primaryKeyValue = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id();
        if (primaryKeyValue != null) {
            rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        if (rowIndex == Table.NO_MATCH) {
            rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
        }
        cache.put(object, rowIndex);
        String realmGet$name = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }

        OsList thumbnailsRawOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.thumbnailsRawIndex);
        RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$thumbnailsRaw();
        if (thumbnailsRawList != null && thumbnailsRawList.size() == thumbnailsRawOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = thumbnailsRawList.size();
            for (int i = 0; i < objects; i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem = thumbnailsRawList.get(i);
                Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                if (cacheItemIndexthumbnailsRaw == null) {
                    cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insertOrUpdate(realm, thumbnailsRawItem, cache);
                }
                thumbnailsRawOsList.setRow(i, cacheItemIndexthumbnailsRaw);
            }
        } else {
            thumbnailsRawOsList.removeAll();
            if (thumbnailsRawList != null) {
                for (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem : thumbnailsRawList) {
                    Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                    if (cacheItemIndexthumbnailsRaw == null) {
                        cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insertOrUpdate(realm, thumbnailsRawItem, cache);
                    }
                    thumbnailsRawOsList.addRow(cacheItemIndexthumbnailsRaw);
                }
            }
        }

        String realmGet$summary = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$summary();
        if (realmGet$summary != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.summaryIndex, rowIndex, realmGet$summary, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.summaryIndex, rowIndex, false);
        }
        Table.nativeSetDouble(tableNativePtr, columnInfo.priceIndex, rowIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$price(), false);
        String realmGet$currency = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$currency();
        if (realmGet$currency != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.currencyIndex, rowIndex, realmGet$currency, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.currencyIndex, rowIndex, false);
        }
        String realmGet$contentType = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$contentType();
        if (realmGet$contentType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, realmGet$contentType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, false);
        }
        String realmGet$copyright = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$copyright();
        if (realmGet$copyright != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.copyrightIndex, rowIndex, realmGet$copyright, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.copyrightIndex, rowIndex, false);
        }
        String realmGet$title = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$title();
        if (realmGet$title != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
        }
        String realmGet$link = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$link();
        if (realmGet$link != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
        }

        com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$authorRaw();
        if (authorRawObj != null) {
            Long cacheauthorRaw = cache.get(authorRawObj);
            if (cacheauthorRaw == null) {
                cacheauthorRaw = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.insertOrUpdate(realm, authorRawObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.authorRawIndex, rowIndex, cacheauthorRaw, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.authorRawIndex, rowIndex);
        }

        com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$categoryRaw();
        if (categoryRawObj != null) {
            Long cachecategoryRaw = cache.get(categoryRawObj);
            if (cachecategoryRaw == null) {
                cachecategoryRaw = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.insertOrUpdate(realm, categoryRawObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.categoryRawIndex, rowIndex, cachecategoryRaw, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.categoryRawIndex, rowIndex);
        }
        java.util.Date realmGet$releaseDate = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
        if (realmGet$releaseDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long tableNativePtr = table.getNativePtr();
        EntryRealmObjectColumnInfo columnInfo = (EntryRealmObjectColumnInfo) realm.getSchema().getColumnInfo(com.example.appstores.sources.stores.entries.models.EntryRealmObject.class);
        long pkColumnIndex = columnInfo.idIndex;
        com.example.appstores.sources.stores.entries.models.EntryRealmObject object = null;
        while (objects.hasNext()) {
            object = (com.example.appstores.sources.stores.entries.models.EntryRealmObject) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = Table.NO_MATCH;
            Object primaryKeyValue = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id();
            if (primaryKeyValue != null) {
                rowIndex = Table.nativeFindFirstInt(tableNativePtr, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            if (rowIndex == Table.NO_MATCH) {
                rowIndex = OsObject.createRowWithPrimaryKey(table, pkColumnIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$id());
            }
            cache.put(object, rowIndex);
            String realmGet$name = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }

            OsList thumbnailsRawOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.thumbnailsRawIndex);
            RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$thumbnailsRaw();
            if (thumbnailsRawList != null && thumbnailsRawList.size() == thumbnailsRawOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = thumbnailsRawList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem = thumbnailsRawList.get(i);
                    Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                    if (cacheItemIndexthumbnailsRaw == null) {
                        cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insertOrUpdate(realm, thumbnailsRawItem, cache);
                    }
                    thumbnailsRawOsList.setRow(i, cacheItemIndexthumbnailsRaw);
                }
            } else {
                thumbnailsRawOsList.removeAll();
                if (thumbnailsRawList != null) {
                    for (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem : thumbnailsRawList) {
                        Long cacheItemIndexthumbnailsRaw = cache.get(thumbnailsRawItem);
                        if (cacheItemIndexthumbnailsRaw == null) {
                            cacheItemIndexthumbnailsRaw = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.insertOrUpdate(realm, thumbnailsRawItem, cache);
                        }
                        thumbnailsRawOsList.addRow(cacheItemIndexthumbnailsRaw);
                    }
                }
            }

            String realmGet$summary = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$summary();
            if (realmGet$summary != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.summaryIndex, rowIndex, realmGet$summary, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.summaryIndex, rowIndex, false);
            }
            Table.nativeSetDouble(tableNativePtr, columnInfo.priceIndex, rowIndex, ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$price(), false);
            String realmGet$currency = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$currency();
            if (realmGet$currency != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.currencyIndex, rowIndex, realmGet$currency, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.currencyIndex, rowIndex, false);
            }
            String realmGet$contentType = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$contentType();
            if (realmGet$contentType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, realmGet$contentType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentTypeIndex, rowIndex, false);
            }
            String realmGet$copyright = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$copyright();
            if (realmGet$copyright != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.copyrightIndex, rowIndex, realmGet$copyright, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.copyrightIndex, rowIndex, false);
            }
            String realmGet$title = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$title();
            if (realmGet$title != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.titleIndex, rowIndex, realmGet$title, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.titleIndex, rowIndex, false);
            }
            String realmGet$link = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$link();
            if (realmGet$link != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.linkIndex, rowIndex, realmGet$link, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.linkIndex, rowIndex, false);
            }

            com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$authorRaw();
            if (authorRawObj != null) {
                Long cacheauthorRaw = cache.get(authorRawObj);
                if (cacheauthorRaw == null) {
                    cacheauthorRaw = com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.insertOrUpdate(realm, authorRawObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.authorRawIndex, rowIndex, cacheauthorRaw, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.authorRawIndex, rowIndex);
            }

            com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$categoryRaw();
            if (categoryRawObj != null) {
                Long cachecategoryRaw = cache.get(categoryRawObj);
                if (cachecategoryRaw == null) {
                    cachecategoryRaw = com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.insertOrUpdate(realm, categoryRawObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.categoryRawIndex, rowIndex, cachecategoryRaw, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.categoryRawIndex, rowIndex);
            }
            java.util.Date realmGet$releaseDate = ((com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) object).realmGet$releaseDate();
            if (realmGet$releaseDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, realmGet$releaseDate.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.releaseDateIndex, rowIndex, false);
            }
        }
    }

    public static com.example.appstores.sources.stores.entries.models.EntryRealmObject createDetachedCopy(com.example.appstores.sources.stores.entries.models.EntryRealmObject realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.example.appstores.sources.stores.entries.models.EntryRealmObject unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.example.appstores.sources.stores.entries.models.EntryRealmObject();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.example.appstores.sources.stores.entries.models.EntryRealmObject) cachedObject.object;
            }
            unmanagedObject = (com.example.appstores.sources.stores.entries.models.EntryRealmObject) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface unmanagedCopy = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) unmanagedObject;
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface realmSource = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        // Deep copy of thumbnailsRaw
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$thumbnailsRaw(null);
        } else {
            RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> managedthumbnailsRawList = realmSource.realmGet$thumbnailsRaw();
            RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> unmanagedthumbnailsRawList = new RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject>();
            unmanagedCopy.realmSet$thumbnailsRaw(unmanagedthumbnailsRawList);
            int nextDepth = currentDepth + 1;
            int size = managedthumbnailsRawList.size();
            for (int i = 0; i < size; i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject item = com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.createDetachedCopy(managedthumbnailsRawList.get(i), nextDepth, maxDepth, cache);
                unmanagedthumbnailsRawList.add(item);
            }
        }
        unmanagedCopy.realmSet$summary(realmSource.realmGet$summary());
        unmanagedCopy.realmSet$price(realmSource.realmGet$price());
        unmanagedCopy.realmSet$currency(realmSource.realmGet$currency());
        unmanagedCopy.realmSet$contentType(realmSource.realmGet$contentType());
        unmanagedCopy.realmSet$copyright(realmSource.realmGet$copyright());
        unmanagedCopy.realmSet$title(realmSource.realmGet$title());
        unmanagedCopy.realmSet$link(realmSource.realmGet$link());

        // Deep copy of authorRaw
        unmanagedCopy.realmSet$authorRaw(com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.createDetachedCopy(realmSource.realmGet$authorRaw(), currentDepth + 1, maxDepth, cache));

        // Deep copy of categoryRaw
        unmanagedCopy.realmSet$categoryRaw(com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.createDetachedCopy(realmSource.realmGet$categoryRaw(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$releaseDate(realmSource.realmGet$releaseDate());

        return unmanagedObject;
    }

    static com.example.appstores.sources.stores.entries.models.EntryRealmObject update(Realm realm, com.example.appstores.sources.stores.entries.models.EntryRealmObject realmObject, com.example.appstores.sources.stores.entries.models.EntryRealmObject newObject, Map<RealmModel, RealmObjectProxy> cache) {
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface realmObjectTarget = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) realmObject;
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface realmObjectSource = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxyInterface) newObject;
        realmObjectTarget.realmSet$name(realmObjectSource.realmGet$name());
        RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawList = realmObjectSource.realmGet$thumbnailsRaw();
        RealmList<com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject> thumbnailsRawRealmList = realmObjectTarget.realmGet$thumbnailsRaw();
        if (thumbnailsRawList != null && thumbnailsRawList.size() == thumbnailsRawRealmList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = thumbnailsRawList.size();
            for (int i = 0; i < objects; i++) {
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem = thumbnailsRawList.get(i);
                com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject cachethumbnailsRaw = (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject) cache.get(thumbnailsRawItem);
                if (cachethumbnailsRaw != null) {
                    thumbnailsRawRealmList.set(i, cachethumbnailsRaw);
                } else {
                    thumbnailsRawRealmList.set(i, com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.copyOrUpdate(realm, thumbnailsRawItem, true, cache));
                }
            }
        } else {
            thumbnailsRawRealmList.clear();
            if (thumbnailsRawList != null) {
                for (int i = 0; i < thumbnailsRawList.size(); i++) {
                    com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject thumbnailsRawItem = thumbnailsRawList.get(i);
                    com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject cachethumbnailsRaw = (com.example.appstores.sources.stores.entries.models.ThumbnailRealmObject) cache.get(thumbnailsRawItem);
                    if (cachethumbnailsRaw != null) {
                        thumbnailsRawRealmList.add(cachethumbnailsRaw);
                    } else {
                        thumbnailsRawRealmList.add(com_example_appstores_sources_stores_entries_models_ThumbnailRealmObjectRealmProxy.copyOrUpdate(realm, thumbnailsRawItem, true, cache));
                    }
                }
            }
        }
        realmObjectTarget.realmSet$summary(realmObjectSource.realmGet$summary());
        realmObjectTarget.realmSet$price(realmObjectSource.realmGet$price());
        realmObjectTarget.realmSet$currency(realmObjectSource.realmGet$currency());
        realmObjectTarget.realmSet$contentType(realmObjectSource.realmGet$contentType());
        realmObjectTarget.realmSet$copyright(realmObjectSource.realmGet$copyright());
        realmObjectTarget.realmSet$title(realmObjectSource.realmGet$title());
        realmObjectTarget.realmSet$link(realmObjectSource.realmGet$link());
        com.example.appstores.sources.stores.authors.models.AuthorRealmObject authorRawObj = realmObjectSource.realmGet$authorRaw();
        if (authorRawObj == null) {
            realmObjectTarget.realmSet$authorRaw(null);
        } else {
            com.example.appstores.sources.stores.authors.models.AuthorRealmObject cacheauthorRaw = (com.example.appstores.sources.stores.authors.models.AuthorRealmObject) cache.get(authorRawObj);
            if (cacheauthorRaw != null) {
                realmObjectTarget.realmSet$authorRaw(cacheauthorRaw);
            } else {
                realmObjectTarget.realmSet$authorRaw(com_example_appstores_sources_stores_authors_models_AuthorRealmObjectRealmProxy.copyOrUpdate(realm, authorRawObj, true, cache));
            }
        }
        com.example.appstores.sources.stores.categories.models.CategoryRealmObject categoryRawObj = realmObjectSource.realmGet$categoryRaw();
        if (categoryRawObj == null) {
            realmObjectTarget.realmSet$categoryRaw(null);
        } else {
            com.example.appstores.sources.stores.categories.models.CategoryRealmObject cachecategoryRaw = (com.example.appstores.sources.stores.categories.models.CategoryRealmObject) cache.get(categoryRawObj);
            if (cachecategoryRaw != null) {
                realmObjectTarget.realmSet$categoryRaw(cachecategoryRaw);
            } else {
                realmObjectTarget.realmSet$categoryRaw(com_example_appstores_sources_stores_categories_models_CategoryRealmObjectRealmProxy.copyOrUpdate(realm, categoryRawObj, true, cache));
            }
        }
        realmObjectTarget.realmSet$releaseDate(realmObjectSource.realmGet$releaseDate());
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("EntryRealmObject = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thumbnailsRaw:");
        stringBuilder.append("RealmList<ThumbnailRealmObject>[").append(realmGet$thumbnailsRaw().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{summary:");
        stringBuilder.append(realmGet$summary());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{price:");
        stringBuilder.append(realmGet$price());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{currency:");
        stringBuilder.append(realmGet$currency());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contentType:");
        stringBuilder.append(realmGet$contentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{copyright:");
        stringBuilder.append(realmGet$copyright());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{title:");
        stringBuilder.append(realmGet$title());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{link:");
        stringBuilder.append(realmGet$link());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{authorRaw:");
        stringBuilder.append(realmGet$authorRaw() != null ? "AuthorRealmObject" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{categoryRaw:");
        stringBuilder.append(realmGet$categoryRaw() != null ? "CategoryRealmObject" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{releaseDate:");
        stringBuilder.append(realmGet$releaseDate());
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
        com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy aEntryRealmObject = (com_example_appstores_sources_stores_entries_models_EntryRealmObjectRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEntryRealmObject.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEntryRealmObject.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEntryRealmObject.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
