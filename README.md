# Enterprise-Java-Development-1.08


# Examples of efficiency using IntArrayList vs IntVector

:memo: A student roster for a small classroom: IntArrayList would likely be more efficient than IntVector because the number of students is unlikely to grow very large, so there's no need to allocate a lot of extra memory for potential growth.

:earth_americas: A logging system for a high-traffic website: IntVector would likely be more efficient than IntArrayList because the log can grow quite large over time, so adding less unused space to the array each time it needs to be resized is important. Additionally, since the website likely already has high memory demands, the additional cost of using a larger array in IntVector would be relatively minor.
