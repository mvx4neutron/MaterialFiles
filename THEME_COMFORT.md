# Eye-Comfort Themes

Material Files now includes seven optional visual themes designed around low glare, comfortable luminance, readable contrast, restrained saturation, and reduced visual stimulation. These are **design comfort scores**, not clinically validated eye-health scores.

| Rank | Theme | Score | Best use |
|---|---|---:|---|
| 1 | Warm Night | 97/100 | Nighttime |
| 2 | Deep Neutral Dark | 96/100 | General long sessions |
| 3 | Muted Amber | 95/100 | Warm productivity |
| 4 | Soft Sepia / Reading | 94/100 | Long-form reading |
| 5 | Dark Red / Terracotta | 93/100 | Muted red preference |
| 6 | Soft Daylight | 91/100 | Bright daytime |
| 7 | AMOLED Minimal | 90/100 | OLED/AMOLED battery efficiency |

## Theme tokens

### Deep Neutral Dark — 96/100
Background `#121212`, surface `#1A1A1A`, card `#242424`, primary text `#D6D2CC`, secondary text `#AAA59E`, divider `#383838`, accent `#C47752`, secondary accent `#C89455`, success `#78956F`, warning `#C89455`, error `#B85F5F`.

### Warm Night — 97/100
Background `#151313`, surface `#211C1A`, card `#2A2320`, primary text `#DDD3C8`, secondary text `#AFA39A`, divider `#403732`, accent `#C98258`, secondary accent `#B99863`, success `#7E9272`, warning `#C39A61`, error `#B96860`.

### Muted Amber — 95/100
Background `#151515`, surface `#20201E`, card `#292824`, primary text `#DDD6C8`, secondary text `#AAA391`, divider `#3A3935`, accent `#B99A63`, secondary accent `#987F52`, success `#7F906E`, warning `#B99A63`, error `#AA6960`.

### Dark Red / Terracotta — 93/100
Background `#121212`, surface `#1B1818`, card `#252020`, primary text `#D8D0CA`, secondary text `#A9A09B`, divider `#383030`, accent `#B85F5F`, secondary accent `#9C6860`, success `#788F70`, warning `#B69561`, error `#B85F5F`.

### Soft Sepia / Reading — 94/100
Background `#F1EBDD`, surface `#E9E1D2`, card `#F5EFE4`, primary text `#332F2A`, secondary text `#6F675D`, divider `#D1C7B7`, accent `#96724F`, secondary accent `#A68561`, success `#687A5F`, warning `#9B7B4F`, error `#9B625A`.

### Soft Daylight — 91/100
Background `#F4F1EA`, surface `#EBE7DE`, card `#F8F5EE`, primary text `#292929`, secondary text `#66635E`, divider `#D4D0C7`, accent `#8B6F55`, secondary accent `#8C795B`, success `#60765B`, warning `#987A4E`, error `#9C625A`.

### AMOLED Minimal — 90/100
Background `#000000`, surface `#101010`, card `#181818`, primary text `#D4D0CA`, secondary text `#99958F`, divider `#2A2A2A`, accent `#B87552`, secondary accent `#A68A5D`, success `#718469`, warning `#A88A59`, error `#A75F5F`.

## Behavior

The themes have light and night resource variants. When Android/AppCompat night mode is set to follow the system or automatic time mode, the selected theme changes to its corresponding night palette rather than simply applying a red filter. Soft Sepia and Soft Daylight deliberately transition to warm dark palettes at night.

The existing Night mode setting supports Follow system, Off, On, Auto time, and Auto battery. For automatic day/night behavior, use **Auto time** or **Follow system**.

## Readability and controls

Primary text uses warm off-white values on dark themes and dark charcoal on light themes. Secondary text remains medium gray rather than becoming excessively dim. Interactive controls use the theme's muted accent, with restrained error, warning, and success colors. No dominant neon colors, glowing effects, pure-red `#FF0000`, pure-green `#00FF00`, or pure-blue `#0000FF` are introduced.

The existing Material Design 3 mode is supported by matching theme variants; enabling Material 3 no longer disables the custom theme selector.

## Important limitation

These themes target reduction of visual discomfort and glare. A color theme should not be described as protecting the retina or preventing eye disease. Eye strain is not the same as retinal damage, and blue-light exposure is not automatically eye damage. Blue/cyan reduction is treated primarily as a nighttime/circadian consideration rather than as a sole eye-strain treatment.

## Recommended defaults

- **Default:** Warm Night — 97/100
- **Night:** Warm Night — 97/100
- **General:** Deep Neutral Dark — 96/100
- **Reading:** Soft Sepia / Reading — 94/100
- **AMOLED:** AMOLED Minimal — 90/100
