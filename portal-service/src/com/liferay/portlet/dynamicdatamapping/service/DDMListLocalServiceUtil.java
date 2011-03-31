/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.dynamicdatamapping.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the d d m list local service. This utility wraps {@link com.liferay.portlet.dynamicdatamapping.service.impl.DDMListLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DDMListLocalService
 * @see com.liferay.portlet.dynamicdatamapping.service.base.DDMListLocalServiceBaseImpl
 * @see com.liferay.portlet.dynamicdatamapping.service.impl.DDMListLocalServiceImpl
 * @generated
 */
public class DDMListLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.liferay.portlet.dynamicdatamapping.service.impl.DDMListLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the d d m list to the database. Also notifies the appropriate model listeners.
	*
	* @param ddmList the d d m list to add
	* @return the d d m list that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList addDDMList(
		com.liferay.portlet.dynamicdatamapping.model.DDMList ddmList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addDDMList(ddmList);
	}

	/**
	* Creates a new d d m list with the primary key. Does not add the d d m list to the database.
	*
	* @param listId the primary key for the new d d m list
	* @return the new d d m list
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList createDDMList(
		long listId) {
		return getService().createDDMList(listId);
	}

	/**
	* Deletes the d d m list with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param listId the primary key of the d d m list to delete
	* @throws PortalException if a d d m list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDDMList(long listId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDDMList(listId);
	}

	/**
	* Deletes the d d m list from the database. Also notifies the appropriate model listeners.
	*
	* @param ddmList the d d m list to delete
	* @throws SystemException if a system exception occurred
	*/
	public static void deleteDDMList(
		com.liferay.portlet.dynamicdatamapping.model.DDMList ddmList)
		throws com.liferay.portal.kernel.exception.SystemException {
		getService().deleteDDMList(ddmList);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query to search with
	* @param start the lower bound of the range of model instances to return
	* @param end the upper bound of the range of model instances to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Counts the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query to search with
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Gets the d d m list with the primary key.
	*
	* @param listId the primary key of the d d m list to get
	* @return the d d m list
	* @throws PortalException if a d d m list with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList getDDMList(
		long listId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMList(listId);
	}

	/**
	* Gets the d d m list with the UUID and group id.
	*
	* @param uuid the UUID of d d m list to get
	* @param groupId the group id of the d d m list to get
	* @return the d d m list
	* @throws PortalException if a d d m list with the UUID and group id could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList getDDMListByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMListByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Gets a range of all the d d m lists.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of d d m lists to return
	* @param end the upper bound of the range of d d m lists to return (not inclusive)
	* @return the range of d d m lists
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMList> getDDMLists(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMLists(start, end);
	}

	/**
	* Gets the number of d d m lists.
	*
	* @return the number of d d m lists
	* @throws SystemException if a system exception occurred
	*/
	public static int getDDMListsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getDDMListsCount();
	}

	/**
	* Updates the d d m list in the database. Also notifies the appropriate model listeners.
	*
	* @param ddmList the d d m list to update
	* @return the d d m list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList updateDDMList(
		com.liferay.portlet.dynamicdatamapping.model.DDMList ddmList)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDMList(ddmList);
	}

	/**
	* Updates the d d m list in the database. Also notifies the appropriate model listeners.
	*
	* @param ddmList the d d m list to update
	* @param merge whether to merge the d d m list with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the d d m list that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portlet.dynamicdatamapping.model.DDMList updateDDMList(
		com.liferay.portlet.dynamicdatamapping.model.DDMList ddmList,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateDDMList(ddmList, merge);
	}

	/**
	* Gets the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMList addList(
		long userId, java.lang.String listKey, boolean autoListKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.lang.String description, long structureId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addList(userId, listKey, autoListKey, nameMap, description,
			structureId, serviceContext);
	}

	public static void addListResources(
		com.liferay.portlet.dynamicdatamapping.model.DDMList list,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addListResources(list, addCommunityPermissions, addGuestPermissions);
	}

	public static void addListResources(
		com.liferay.portlet.dynamicdatamapping.model.DDMList list,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.addListResources(list, communityPermissions, guestPermissions);
	}

	public static void deleteLists(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteLists(groupId);
	}

	public static void deleteList(
		com.liferay.portlet.dynamicdatamapping.model.DDMList list)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteList(list);
	}

	public static void deleteList(long listId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteList(listId);
	}

	public static void deleteList(long groupId, java.lang.String listKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService().deleteList(groupId, listKey);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMList> getLists(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getLists(groupId);
	}

	public static int getListsCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getListsCount(groupId);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMList getList(
		long listId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getList(listId);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMList getList(
		long groupId, java.lang.String listKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getList(groupId, listKey);
	}

	public static java.util.List<com.liferay.portlet.dynamicdatamapping.model.DDMList> search(
		long companyId, long groupId, java.lang.String keywords, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .search(companyId, groupId, keywords, start, end,
			orderByComparator);
	}

	public static int searchCount(long companyId, long groupId,
		java.lang.String keywords)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().searchCount(companyId, groupId, keywords);
	}

	public static com.liferay.portlet.dynamicdatamapping.model.DDMList updateList(
		long groupId, java.lang.String listKey,
		java.util.Map<java.util.Locale, java.lang.String> nameMap,
		java.lang.String description, long structureId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateList(groupId, listKey, nameMap, description,
			structureId, serviceContext);
	}

	public static DDMListLocalService getService() {
		if (_service == null) {
			_service = (DDMListLocalService)PortalBeanLocatorUtil.locate(DDMListLocalService.class.getName());

			ReferenceRegistry.registerReference(DDMListLocalServiceUtil.class,
				"_service");
			MethodCache.remove(DDMListLocalService.class);
		}

		return _service;
	}

	public void setService(DDMListLocalService service) {
		MethodCache.remove(DDMListLocalService.class);

		_service = service;

		ReferenceRegistry.registerReference(DDMListLocalServiceUtil.class,
			"_service");
		MethodCache.remove(DDMListLocalService.class);
	}

	private static DDMListLocalService _service;
}