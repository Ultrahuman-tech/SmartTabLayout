package com.ogaclejapan.smarttablayout;

import androidx.annotation.Nullable;

public interface TabTitleProvider {
    @Nullable
    CharSequence getPageTitle(int position);
}
