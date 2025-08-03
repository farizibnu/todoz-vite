<template>
  <li class="flex justify-between items-center bg-white border-2 border-black p-2 rounded-xl shadow-[0_4px_0_rgba(0,0,0,1)]">
    <div class="flex flex-col gap-1">
      <p class="font-bold text-xl">{{ todo.name }}</p>
      <p class="">{{ todo.description }}</p>
    </div>
    <div class="flex flex-col gap-1">
      <p class="font-bold">{{ formatDate(todo.startDate) }}</p>
      <p class="font-bold">{{ formatDate(todo.endDate) }}</p>
    </div>
    <button
      @click="$emit('remove')"
      class="text-white bg-red-500 hover:bg-red-600 px-2 py-1 rounded"
    >
    <div class="pi pi-times"></div>
    </button>
  </li>
</template>

<script setup>
defineProps({
  todo: Object
});

function formatDate(dateStr) {
  const date = new Date(dateStr)
  return date.toLocaleDateString('id-ID', {
    year: 'numeric',
    month: 'long',
    day: 'numeric'
  })
}
</script>
