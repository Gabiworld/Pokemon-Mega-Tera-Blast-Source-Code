package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.C0150R;
import androidx.core.content.res.ResourcesCompat;
import java.util.List;

class BrowserActionsFallbackMenuAdapter extends BaseAdapter {
    private final Context mContext;
    private final List<BrowserActionItem> mMenuItems;

    public long getItemId(int i) {
        return (long) i;
    }

    BrowserActionsFallbackMenuAdapter(List<BrowserActionItem> list, Context context) {
        this.mMenuItems = list;
        this.mContext = context;
    }

    public int getCount() {
        return this.mMenuItems.size();
    }

    public Object getItem(int i) {
        return this.mMenuItems.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolderItem viewHolderItem;
        BrowserActionItem browserActionItem = this.mMenuItems.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(C0150R.layout.browser_actions_context_menu_row, (ViewGroup) null);
            viewHolderItem = new ViewHolderItem();
            viewHolderItem.mIcon = (ImageView) view.findViewById(C0150R.C0152id.browser_actions_menu_item_icon);
            viewHolderItem.mText = (TextView) view.findViewById(C0150R.C0152id.browser_actions_menu_item_text);
            view.setTag(viewHolderItem);
        } else {
            viewHolderItem = (ViewHolderItem) view.getTag();
        }
        viewHolderItem.mText.setText(browserActionItem.getTitle());
        if (browserActionItem.getIconId() != 0) {
            viewHolderItem.mIcon.setImageDrawable(ResourcesCompat.getDrawable(this.mContext.getResources(), browserActionItem.getIconId(), (Resources.Theme) null));
        } else {
            viewHolderItem.mIcon.setImageDrawable((Drawable) null);
        }
        return view;
    }

    static class ViewHolderItem {
        ImageView mIcon;
        TextView mText;

        ViewHolderItem() {
        }
    }
}
