
## 抛弃枚举：优化使用方法 （基于Intellij的“魔术常量”检查机制）

     Person.getFlavour(Person.CHOCOLATE);
     otherWay(Person.CHOCOLATE);

   	 private void otherWay(@Person.Flavour int type){
    
    }

## 限定符操作

- LayoutRes：layout资源类型
- StringRes：string资源类型
- DrawableRes：drawable资源类型
- ColorRes：color资源类型
- IdRes：id资源类型
- StyleableRes：styleable资源类型
- RawRes：raw资源类型
- StyleRes：style资源类型
- DimenRes：dimen资源类型。
- AnimatorRes ：animator资源类型
- AnimRes：anim资源类型
- AnyRes：任意资源类型
- ArrayRes：array资源类型
- AttrRes：attr资源类型
- BoolRes：boolean资源类型
- FractionRes：fraction资源类型
- IntegerRes：integer资源类型
- InterpolatorRes：interpolator资源类型
- MenuRes：menu资源类型
- PluralsRes：plurals资源类型
- TransitionRes：transition资源类型
- XmlRes：xml资源类型
 
### 栗子： 

  	  //左侧无 中间标题 右侧图片
       public void justSetRightTxtTitleBar(@StringRes int title,@DrawableRes int Img) {
       	 initToolbar();
      	 leftimg.setVisibility(View.GONE);
     	 rightimg.setVisibility(View.VISIBLE);
      	 mToolTarTitle.setText(getString(title));
      	 rightimg.setImageResource(Img);
     	 mRightClick();
       }
	   
## TODO的用法
我们经常会使用TODO来标记我们的代码，一般是用来表示待完成，或者待解决的部分

详细：http://blog.csdn.net/my_truelove/article/details/72857949

一句话弄清二者区别： TODO 是总称，FIXME 是细分。

### 栗子： 
      // TODO: 2017/12/4  待完成
      // FIXME: 2017/12/4 待解决的(待修复的)

	
### 数据传递：  
    Parcelable 比 Serializable 效率高
	Parcelable封装：https://github.com/mcharmas/android-parcelable-intellij-plugin
