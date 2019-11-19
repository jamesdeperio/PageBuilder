## PageBuilder
- - create carousel with less boilerplates
___
### USAGE
```gradle
//root build.gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```gradle
    dependencies {
	        implementation 'com.github.jamesdeperio:PageBuilder:1.0.0'
	}
```
#### kotlin
```kotlin
 supportFragmentManager.buildPage {
            this.viewPager = view_pager
            this.tabLayout = tab_layout // optional / null by default
            this.pageTransformer = null // optional / null by default
            addPage(title = "1", fragment = PageFragment.newInstance("PAGE 1")) //optional title 
            addPage(title = "2", fragment = PageFragment.newInstance("PAGE 2"))
            addPage(title = "3", fragment = PageFragment.newInstance("PAGE 3"))
            addPage(title = "4", fragment = PageFragment.newInstance("PAGE 4"))
        }
```
#### java
```java
PageBuilder.build(fragmentManager = supportFragmentManager) {
            this.viewPager = view_pager
            this.tabLayout = tab_layout // optional / null by default
            this.pageTransformer = null // optional / null by default
            addPage(title = "1", fragment = PageFragment.newInstance("PAGE 1")) //optional title 
            addPage(title = "2", fragment = PageFragment.newInstance("PAGE 2"))
            addPage(title = "3", fragment = PageFragment.newInstance("PAGE 3"))
            addPage(title = "4", fragment = PageFragment.newInstance("PAGE 4"))
        }
```
___
## DEPENDENCIES
Thanks to the author of external Library used:
* [org.jetbrains.kotlin:kotlin-stdlib-jdk7](https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib)
* [com.android.support:appcompat-v7](https://developer.android.com/topic/libraries/support-library/)
* [com.android.support:design](https://developer.android.com/topic/libraries/support-library/)

### LICENSE
```
Copyright 2019 The PageBuilder Contributors

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
