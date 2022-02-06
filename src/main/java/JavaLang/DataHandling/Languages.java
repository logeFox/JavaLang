//    MIT License
//
//    Copyright (c) 2021 Alessandro <https://github.com/logeFox>
//
//    Permission is hereby granted, free of charge, to any person obtaining a copy
//    of this software and associated documentation files (the "Software"), to deal
//    in the Software without restriction, including without limitation the rights
//    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
//    copies of the Software, and to permit persons to whom the Software is
//    furnished to do so, subject to the following conditions:
//
//    The above copyright notice and this permission notice shall be included in all
//    copies or substantial portions of the Software.
//
//    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
//    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
//    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
//    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
//    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
//    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
//    SOFTWARE.

package JavaLang.DataHandling;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Languages {
    af_ZA,
    sq_AL,
    ar_DZ,
    ar_BH,
    ar_EG,
    ar_IQ,
    ar_JO,
    ar_KW,
    ar_LB,
    ar_LY,
    ar_MA,
    ar_OM,
    ar_QA,
    ar_SA,
    ar_SY,
    ar_TN,
    ar_AE,
    ar_YE,
    hy_AM,
    Cy_az_AZ,
    Lt_az_AZ,
    eu_ES,
    be_BY,
    bg_BG,
    ca_ES,
    zh_CN,
    zh_HK,
    zh_MO,
    zh_SG,
    zh_TW,
    zh_CHS,
    zh_CHT,
    hr_HR,
    cs_CZ,
    da_DK,
    div_MV,
    nl_BE,
    nl_NL,
    en_AU,
    en_BZ,
    en_CA,
    en_CB,
    en_IE,
    en_JM,
    en_NZ,
    en_PH,
    en_ZA,
    en_TT,
    en_GB,
    en_US,
    en_ZW,
    et_EE,
    fo_FO,
    fa_IR,
    fi_FI,
    fr_BE,
    fr_CA,
    fr_FR,
    fr_LU,
    fr_MC,
    fr_CH,
    gl_ES,
    ka_GE,
    de_AT,
    de_DE,
    de_LI,
    de_LU,
    de_CH,
    el_GR,
    gu_IN,
    he_IL,
    hi_IN,
    hu_HU,
    is_IS,
    id_ID,
    it_IT,
    it_CH,
    ja_JP,
    kn_IN,
    kk_KZ,
    kok_IN,
    ko_KR,
    ky_KZ,
    lv_LV,
    lt_LT,
    mk_MK,
    ms_BN,
    ms_MY,
    mr_IN,
    mn_MN,
    nb_NO,
    nn_NO,
    pl_PL,
    pt_BR,
    pt_PT,
    pa_IN,
    ro_RO,
    ru_RU,
    sa_IN,
    Cy_sr_SP,
    Lt_sr_SP,
    sk_SK,
    sl_SI,
    es_AR,
    es_BO,
    es_CL,
    es_CO,
    es_CR,
    es_DO,
    es_EC,
    es_SV,
    es_GT,
    es_HN,
    es_MX,
    es_NI,
    es_PA,
    es_PY,
    es_PE,
    es_PR,
    es_ES,
    es_UY,
    es_VE,
    sw_KE,
    sv_FI,
    sv_SE,
    syr_SY,
    ta_IN,
    tt_RU,
    te_IN,
    th_TH,
    tr_TR,
    uk_UA,
    ur_PK,
    Cy_uz_UZ,
    Lt_uz_UZ,
    vi_VN;

    public static boolean contains(String test) {
        return getLanguagesAsSet().contains(test);
    }

    public static Set<String> getLanguagesAsSet() {
        return Stream.of(Languages.values())
                     .map(Languages::name)
                     .collect(Collectors.toSet());
    }
}
