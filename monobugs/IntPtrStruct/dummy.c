#include <stdio.h>
#include "dummy.h"

void* jni4net_zero()
{
	return NULL;
}

void* jni4net_dummy(void* ptr)
{
	printf("%d\n", (unsigned int)ptr);
	return ptr;
}

delegateType jni4net_gimme()
{
	return &jni4net_dummy;
}

void* jni4net_callme(delegateType deledatePtr, void* ptr )
{
	return (*deledatePtr)(ptr);
}
